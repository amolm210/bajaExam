package com.app.controllerbajaj;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dtobajaj.RequestBajajDto;
import com.app.dtobajaj.ResponseBajajDto;

@RestController
@RequestMapping
public class Example_bajaj {
	//"data": [“A”,”1”,”334”,”4”,”R”]
	@PostMapping("/bfhlgirish")
	public ResponseBajajDto example1(@RequestBody RequestBajajDto req) {
		ResponseBajajDto responseVar=new ResponseBajajDto();
		System.out.println(Arrays.toString(req.getAlphabets()));
		//
		int place=0,place2=0;
		String[] obj=req.getAlphabets();
		String[]  alphabets=new String[obj.length];
		int[] num=new int[obj.length];
		
		for(int i=0;i<obj.length;i++) {
			//System.out.println(obj[i]);
			if(Character.isLetter(obj[i].charAt(0))) {	
				//System.out.println(obj[i].charAt(0));
				alphabets[place++]=obj[i];
			}else {
				num[place2++]=Integer.parseInt(obj[i]);
			}
		}
		
		responseVar.set_success(true);
		responseVar.setAlphabets(alphabets);
		responseVar.setNumbers(num);
		responseVar.setEmail("girishchipare@gmail.com");
		responseVar.setRoll_number("219069");
		responseVar.setUser_id("girish_chipare_210941220068");

		return responseVar;
	}

}
