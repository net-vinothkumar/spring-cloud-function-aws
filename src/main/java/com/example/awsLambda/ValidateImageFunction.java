package com.example.awsLambda;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ValidateImageFunction implements Function<ImageInput, ImageOutput> {

    @Override
    public ImageOutput apply(final ImageInput input) {
        ImageOutput imageOutput = new ImageOutput();
        if(input.getInput().length() > 0){
            imageOutput.setResult("the given image is valid image.");
        }
        imageOutput.setResult("the given image is invalid image.");
        return imageOutput;
    }
}
