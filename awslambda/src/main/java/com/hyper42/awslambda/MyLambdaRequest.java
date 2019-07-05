package com.hyper42.awslambda;

public class MyLambdaRequest {
    String name;
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}