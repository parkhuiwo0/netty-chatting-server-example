package io.github.parkhuiwo0.chattingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChattingDemoApplication {

//	@Autowired private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ChattingDemoApplication.class, args);
	}

//	@Bean
//	public ApplicationRunner applicationRunner() {
//		return args -> {
//			ChattingDoc chattingDoc = new ChattingDoc();
//
//			chattingDoc.setContents("asdasfd");
//			mongoTemplate.insert(chattingDoc);
//		};
//	}

}
