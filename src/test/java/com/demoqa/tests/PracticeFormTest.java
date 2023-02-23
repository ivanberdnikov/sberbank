package com.demoqa.tests;

import com.demoqa.components.ResultTableComponent;
import com.demoqa.pages.PracticeFormPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest extends AbstractTest{

    @Test
    public void fillPracticeForm(){
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        ResultTableComponent resultTableComponent = new ResultTableComponent();
        Faker faker = new Faker();
        String firstName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                email = firstName + lastName + "@mail.ru",
                gender = "Male",
                mobileNumber = faker.phoneNumber().subscriberNumber(10),
                birthdayDay = faker.number().numberBetween(0, 28) + "",
                birthdayMonth = "January",
                birthdayYear = faker.number().numberBetween(1900, 2100) + "",
                subject = "Math",
                hobby = "Reading",
                address = faker.address().fullAddress(),
                state = "NCR",
                city = "Delhi";
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove();");
        zoom(0.75);
        practiceFormPage.fillFirstName(firstName)
                .fillLastName(lastName)
                .fillEmail(email)
                .selectGender(gender)
                .fillMobileNumber(mobileNumber)
                .fillDateOfBirth(birthdayDay, birthdayMonth, birthdayYear)
                .fillSubjects(subject)
                .selectHobbies(hobby)
                .uploadFile()
                .fillCurrentAddress(address)
                .selectStateAndCity(state, city)
                .clickSubmit();
        resultTableComponent.isTitleVisible()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender", gender)
                .checkResult("Mobile", mobileNumber)
                .checkResult("Date of Birth", birthdayDay + " " + birthdayMonth + "," + birthdayYear)
                .checkResult("Subjects", subject)
                .checkResult("Hobbies", hobby)
                .checkResult("Address", address)
                .checkResult("State and City", state + " " + city);
    }
}