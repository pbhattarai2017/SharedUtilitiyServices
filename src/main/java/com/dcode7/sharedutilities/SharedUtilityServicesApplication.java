package com.dcode7.sharedutilities;

import java.io.FileReader;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;

import com.dcode7.sharedutilities.models.Pincode;
import com.dcode7.sharedutilities.repositories.PincodeRepository;
import com.opencsv.CSVReader;

@SpringBootApplication
public class SharedUtilityServicesApplication implements CommandLineRunner {

	@Autowired
	private PincodeRepository pincodeRepository;

	@Value("classpath:static/all_india_pin_code.csv")
	Resource pincodeCsvFileResource;

//	@Value("#{new Integer('${spring.jpa.properties.hibernate.jdbc.batch_size}')}")
	@Value("${spring.jpa.properties.hibernate.jdbc.batch_size}")
	private Integer batchSize;

	private Log LOG;

	public static void main(String[] args) {
		SpringApplication.run(SharedUtilityServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG = LogFactory.getLog(SharedUtilityServicesApplication.class);

		long totalPincodeEntities = pincodeRepository.count();
		
		if (totalPincodeEntities > 0) {
			LOG.info(String.format("Total existing Pincode entities: %d", totalPincodeEntities));
			return;
		}

		try (CSVReader csvReader = new CSVReader(new FileReader(pincodeCsvFileResource.getFile()))) {

			String[] line = null;
			csvReader.readNext();

			int count = 0;

			ArrayList<Pincode> pincodeArray = new ArrayList<>();

			while ((line = csvReader.readNext()) != null) {
//				logger.debug(String.join(", ", line));
//				System.out.print(String.join(", ", line));

//				if (line.length < 10) {
//					int j = 0;
//					for (String l : line) {
//						System.out.format("\tline[%d] = %s\n", j++, l);
//					}
//				} else {
//					System.out.format("count = %d, line.length = %d\n", count, line.length);
//				}
//				count++;
				// data clean-up
				for (int i = 0; i < line.length; i++) {
					line[i] = line[i].trim();
				}
//				Pincode(Integer pinCode, String officeName, String officeType, String deliveryStatus, String divisionName,
//						String regionName, String circleName, String taluk, String districtName, String stateName) 
				pincodeArray.add(new Pincode(Integer.parseInt(line[1]), line[0], line[2], line[3], line[4], line[5],
						line[6], line[7], line[8], line[9]));

				// flush the Pincode entities to persistence
				if (pincodeArray.size() >= batchSize) {
					count += pincodeArray.size();
					pincodeRepository.saveAll(pincodeArray);
					pincodeArray.clear();
					LOG.info(String.format("inserted %d records", count));
				}
			}
			// flush remaining Pincode entities as well
			if (pincodeArray.size() > 0) {
				pincodeRepository.saveAll(pincodeArray);
				pincodeArray.clear();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
