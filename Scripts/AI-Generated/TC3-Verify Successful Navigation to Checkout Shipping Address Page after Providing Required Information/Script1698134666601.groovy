import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page product apple-iphone-15-new'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/product/apple-iphone-15-new')

'step 2: At Page product apple-iphone-15-new click on label object'

testObj = findTestObject('Object Repository/Page_product/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page product apple-iphone-15-new click on label object'

testObj = findTestObject('Object Repository/Page_product/label_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page product apple-iphone-15-new click on button object'

testObj = findTestObject('Object Repository/Page_product/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page product apple-iphone-15-new click on hyperlink cart --> navigate to Page cart'

testObj = findTestObject('Object Repository/Page_product/hyperlink_cart')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page cart click on button object --> navigate to Page checkout info'

testObj = findTestObject('Object Repository/Page_cart/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/cart(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page checkout info input on input r0'

testObj = findTestObject('Object Repository/Page_checkout_info/input_r0')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_r0)

'step 8: At Page checkout info click on input receive marketing info'

testObj = findTestObject('Object Repository/Page_checkout_info/input_receive_marketing_info')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page checkout info click on button object --> navigate to Page checkout shipping-address'

testObj = findTestObject('Object Repository/Page_checkout_info/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/info(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page checkout shipping-address click on input delivery id'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_delivery_id')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page checkout shipping-address input on input r1'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_r1)

'step 12: At Page checkout shipping-address input on input r2'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_r2)

'step 13: At Page checkout shipping-address input on input r3'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_4_input_r3)

'step 14: At Page checkout shipping-address input on input r4'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r4')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_5_input_r4)

'step 15: At Page checkout shipping-address input on input r5'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r5')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_6_input_r5)

'step 16: At Page checkout shipping-address input on input r6'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r6')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_7_input_r6)

'step 17: At Page checkout shipping-address select on select r7'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/select_r7')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.selectOptionByValue(testObj, 'United States', false)

'step 18: At Page checkout shipping-address input on input r8'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_r8')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_8_input_r8)

'step 19: At Page checkout shipping-address click on input billing address the same'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/input_billing_address_the_same')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 20: At Page checkout shipping-address click on button object'

testObj = findTestObject('Object Repository/Page_checkout_shipping-address/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/checkout/shipping-address(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 21: Add visual checkpoint at Page checkout shipping-address'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Successful Navigation to Checkout Shipping Address Page after Providing Required Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
