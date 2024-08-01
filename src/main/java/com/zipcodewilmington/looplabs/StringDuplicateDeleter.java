package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter(x -> getOccurence(x) < maxNumberOfDuplications).toArray(String[]::new);
    }

    public Long getOccurence(String y){
        return Arrays.stream(array).filter(x -> x.equals(y)).count();
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(x -> getOccurence(x) != exactNumberOfDuplications).toArray(String[]::new);
    }
}
