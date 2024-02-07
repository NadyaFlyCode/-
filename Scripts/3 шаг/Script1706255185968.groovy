import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Вызов первого тестового случая
WebUI.callTestCase(findTestCase('Запрос'), [:], FailureHandling.STOP_ON_FAILURE)

// Вызов второго тестового случая
WebUI.callTestCase(findTestCase('vc'), [:], FailureHandling.STOP_ON_FAILURE)

// Получение тела ответа после выполнения второго тестового случая
def response = WS.sendRequest(findTestObject('Page_vc.ru  , , ,  ,/New Request'))
String responseBody = response.getResponseBodyContent()

// Раскодирование escape-последовательностей Unicode
String decodedResponseBody = org.apache.commons.lang3.StringEscapeUtils.unescapeJava(responseBody)

// Найдите веб-элемент, куда вы хотите вставить текст (замените 'yourInputField' на соответствующий объект вашего веб-сайта)
TestObject inputField = findTestObject('Page_vc.ru  , , ,  ,/Пост')

// Вставьте текст в поле
WebUI.setText(inputField, 'Response Body: ' + decodedResponseBody)

