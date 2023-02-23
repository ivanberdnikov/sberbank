package com.demoqa.tests;

import com.demoqa.components.ResultTableComponent;
import com.demoqa.pages.PracticeFormPage;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.zoom;

public class PracticeFormTest extends AbstractTest{

    @Test
    public void fillPracticeForm(){
        PracticeFormPage practiceFormPage = new PracticeFormPage();
        ResultTableComponent resultTableComponent = new ResultTableComponent();
        String firstName = "Сергей",
                lastName = "Пупкин",
                email = "123@mail.ru",
                gender = "Male",
                mobileNumber = "9961778757",
                birthdayDay = "10",
                birthdayMonth = "January",
                birthdayYear = "2000",
                subject = "Math",
                hobby = "Reading",
                address = "г. Казань, Островского 98",
                state = "NCR",
                city = "Delhi";
        open("/automation-practice-form");
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