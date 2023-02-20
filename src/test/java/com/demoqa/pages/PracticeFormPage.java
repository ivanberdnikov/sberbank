package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.components.ResultTableComponent;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage {
    private final SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            email = $("#userEmail"),
            gender = $("#genterWrapper"),
            mobileNumber = $("#userNumber"),
            dateOfBirth = $("#dateOfBirthInput"),
            dateOfBirthMonth = $(".react-datepicker__month-select"),
            dateOfBirthYear = $(".react-datepicker__year-select"),
            dateOfBirthDay = $(".react-datepicker"),
            subjects = $("#subjectsInput"),
            hobbies = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            stateCityWrapper = $("#stateCity-wrapper"),
            city = $("#city"),
            state = $("#state"),
            submit = $("#submit");

    public PracticeFormPage selectGender(String value) {
        gender.$(byText(value)).click();
        return this;
    }

    public PracticeFormPage selectStateAndCity(String value, String secondValue) {
        state.click();
        stateCityWrapper.$(byText(value)).click();
        city.click();
        stateCityWrapper.$(byText(secondValue)).click();
        return this;
    }

    public ResultTableComponent clickSubmit() {
        submit.click();
        return new ResultTableComponent();
    }

    public PracticeFormPage selectHobbies(String value) {
        hobbies.$(byText(value)).click();
        return this;
    }

    public PracticeFormPage fillFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    public PracticeFormPage fillCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public PracticeFormPage fillLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    public PracticeFormPage fillEmail(String value) {
        email.setValue(value);
        return this;
    }

    public PracticeFormPage fillMobileNumber(String value) {
        mobileNumber.setValue(value);
        return this;
    }

    public PracticeFormPage uploadFile() {
        uploadPicture.uploadFile(new File("src/test/java/ru/scbt/qa/tests/demoqa/data/selenide.png"));
        return this;
    }

    public PracticeFormPage fillSubjects(String value) {
        subjects.setValue(value).sendKeys(Keys.ENTER);
        return this;
    }

    public PracticeFormPage fillDateOfBirth(String day, String month, String year) {
        dateOfBirth.click();
        dateOfBirthMonth.selectOptionContainingText(month);
        dateOfBirthYear.selectOptionContainingText(year);
        dateOfBirthDay.$(byText(day)).click();
        return this;
    }
}