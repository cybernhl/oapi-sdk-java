// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.corehr.v2;

import com.lark.oapi.core.Config;
import com.lark.oapi.service.corehr.v2.resource.*;
import com.lark.oapi.service.corehr.v2.resource.Process;

public class V2 {
    private final BasicInfoBank basicInfoBank; // basic_info.bank
    private final BasicInfoBankBranch basicInfoBankBranch; // basic_info.bank_branch
    private final BasicInfoCity basicInfoCity; // basic_info.city
    private final BasicInfoCountryRegion basicInfoCountryRegion; // basic_info.country_region
    private final BasicInfoCountryRegionSubdivision basicInfoCountryRegionSubdivision; // basic_info.country_region_subdivision
    private final BasicInfoCurrency basicInfoCurrency; // basic_info.currency
    private final BasicInfoDistrict basicInfoDistrict; // basic_info.district
    private final BasicInfoNationality basicInfoNationality; // basic_info.nationality
    private final Bp bp; // bp
    private final Company company; // company
    private final Contract contract; // contract
    private final CostCenter costCenter; // cost_center
    private final CostCenterVersion costCenterVersion; // cost_center.version
    private final Department department; // department
    private final Employee employee; // employee
    private final EmployeesBp employeesBp; // employees.bp
    private final EmployeesJobData employeesJobData; // employees.job_data
    private final Job job; // job
    private final JobChange jobChange; // job_change
    private final JobFamily jobFamily; // job_family
    private final JobLevel jobLevel; // job_level
    private final Location location; // location
    private final Person person; // person
    private final PreHire preHire; // 待入职
    private final Probation probation; // probation
    private final ProbationAssessment probationAssessment; // probation.assessment
    private final Process process; // process
    private final ProcessApprover processApprover; // process.approver
    private final ProcessCc processCc; // process.cc

    public V2(Config config) {
        this.basicInfoBank = new BasicInfoBank(config);
        this.basicInfoBankBranch = new BasicInfoBankBranch(config);
        this.basicInfoCity = new BasicInfoCity(config);
        this.basicInfoCountryRegion = new BasicInfoCountryRegion(config);
        this.basicInfoCountryRegionSubdivision = new BasicInfoCountryRegionSubdivision(config);
        this.basicInfoCurrency = new BasicInfoCurrency(config);
        this.basicInfoDistrict = new BasicInfoDistrict(config);
        this.basicInfoNationality = new BasicInfoNationality(config);
        this.bp = new Bp(config);
        this.company = new Company(config);
        this.contract = new Contract(config);
        this.costCenter = new CostCenter(config);
        this.costCenterVersion = new CostCenterVersion(config);
        this.department = new Department(config);
        this.employee = new Employee(config);
        this.employeesBp = new EmployeesBp(config);
        this.employeesJobData = new EmployeesJobData(config);
        this.job = new Job(config);
        this.jobChange = new JobChange(config);
        this.jobFamily = new JobFamily(config);
        this.jobLevel = new JobLevel(config);
        this.location = new Location(config);
        this.person = new Person(config);
        this.preHire = new PreHire(config);
        this.probation = new Probation(config);
        this.probationAssessment = new ProbationAssessment(config);
        this.process = new Process(config);
        this.processApprover = new ProcessApprover(config);
        this.processCc = new ProcessCc(config);
    }

    public BasicInfoBank basicInfoBank() {
        return basicInfoBank;
    }

    public BasicInfoBankBranch basicInfoBankBranch() {
        return basicInfoBankBranch;
    }

    public BasicInfoCity basicInfoCity() {
        return basicInfoCity;
    }

    public BasicInfoCountryRegion basicInfoCountryRegion() {
        return basicInfoCountryRegion;
    }

    public BasicInfoCountryRegionSubdivision basicInfoCountryRegionSubdivision() {
        return basicInfoCountryRegionSubdivision;
    }

    public BasicInfoCurrency basicInfoCurrency() {
        return basicInfoCurrency;
    }

    public BasicInfoDistrict basicInfoDistrict() {
        return basicInfoDistrict;
    }

    public BasicInfoNationality basicInfoNationality() {
        return basicInfoNationality;
    }

    public Bp bp() {
        return bp;
    }

    public Company company() {
        return company;
    }

    public Contract contract() {
        return contract;
    }

    public CostCenter costCenter() {
        return costCenter;
    }

    public CostCenterVersion costCenterVersion() {
        return costCenterVersion;
    }

    public Department department() {
        return department;
    }

    public Employee employee() {
        return employee;
    }

    public EmployeesBp employeesBp() {
        return employeesBp;
    }

    public EmployeesJobData employeesJobData() {
        return employeesJobData;
    }

    public Job job() {
        return job;
    }

    public JobChange jobChange() {
        return jobChange;
    }

    public JobFamily jobFamily() {
        return jobFamily;
    }

    public JobLevel jobLevel() {
        return jobLevel;
    }

    public Location location() {
        return location;
    }

    public Person person() {
        return person;
    }

    public PreHire preHire() {
        return preHire;
    }

    public Probation probation() {
        return probation;
    }

    public ProbationAssessment probationAssessment() {
        return probationAssessment;
    }

    public Process process() {
        return process;
    }

    public ProcessApprover processApprover() {
        return processApprover;
    }

    public ProcessCc processCc() {
        return processCc;
    }
}