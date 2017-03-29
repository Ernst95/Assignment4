package com.Assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/03/28.
 */
@Configuration
public class AppConfig{

    @Bean(name = "employee")
    public Employee getServiceEmp()
    {
        return new Employee();
    }

    @Bean(name = "cashier")
    public Cashier getServiceCash()
    {
        return new Cashier();
    }

    @Bean(name = "manager")
    public Manager getServiceMan()
    {
        return new Manager();
    }

    @Bean(name = "cashierWages")
    public SalaryCalculate getCashierWages(){return new Cashier();}

    @Bean(name = "managerWages")
    public SalaryCalculate getManagerWages(){return new Manager();}
 }

