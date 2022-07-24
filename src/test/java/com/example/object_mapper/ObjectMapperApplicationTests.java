package com.example.object_mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-----------------");

		//오브젝트 맵퍼는 텍스트 제이슨을 오브젝트로 바꿔주고
		//반댕로 오브젝트를 텍스트 제이슨으로 바꿔줌

		var ObjectMapper = new ObjectMapper();


		//object -> text;
		var user = new User("steve",10);
		var text = ObjectMapper.writeValueAsString(user);
		System.out.println(text);
		//오브젝트 뤱퍼가 텍스트로 바뀔때는 겟 메소드를 참고 한다.
		//유저 클래스에 겟메소드 추가 햇음

		//text -> object;
		//1첫번째 파라미터 제이슨 형태
		//2번쨰 파라미터는 어떠한 클래스 타입으로 바꿀껀지 , 클래스를 넣어줌
		//디폴트 생성자가 있어야됨
		var objectUser = ObjectMapper.readValue(text,User.class);
		System.out.println(objectUser);

	}

}
