package com.wdxy.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class FastJsonTest {

	public static void main(String[] args) {
		String json = "{'id':'11','name':'ss'}";
		JSONObject jsonObject = JSON.parseObject(json, JSONObject.class);
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("name"));
	}
}
