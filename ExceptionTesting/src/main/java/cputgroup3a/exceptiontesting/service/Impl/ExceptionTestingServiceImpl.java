/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.exceptiontesting.service.Impl;

/**
 *
 * @author kurvin
 */

import cputgroup3a.exceptiontesting.service.ExceptionTestingService;

public class ExceptionTestingServiceImpl implements ExceptionTestingService{
    @Override
    public int calculate(int num){
        return num*num;
    }
}
