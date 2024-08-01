package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter(x -> getOccurence(x) < maxNumberOfDuplications).toArray(Integer[]::new);
    }

   public Long getOccurence(int x){
        return Arrays.stream(array).filter(y -> y == x).count();
   }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(x -> getOccurence(x) != exactNumberOfDuplications).toArray(Integer[]::new);
    }
}
