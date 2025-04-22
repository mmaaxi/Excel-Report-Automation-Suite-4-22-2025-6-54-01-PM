package steps;

import pages.tc_001Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_001Steps {
    tc_001Page claimAccountingReportPage = new tc_001Page();

    @Given("^I am logged into the system$")
    public void iAmLoggedIntoTheSystem() {
        // Code to log into the system
    }

    @When("^I navigate to the 'Canned Reports > Module Claim > Report Code > Claim Accounting Report'$")
    public void iNavigateToClaimAccountingReport() {
        claimAccountingReportPage.navigateToClaimAccountingReport();
    }

    @When("^I follow the flow to 'Submit > View Log > Add Folio > Download Excel file'$")
    public void iFollowTheFlowToDownloadExcel() {
        claimAccountingReportPage.followSubmitViewLogAddFolioDownloadFlow();
    }

    @Then("^The system displays the flow correctly and allows the download of the Excel$")
    public void systemDisplaysFlowAndAllowsDownload() {
        assertTrue(claimAccountingReportPage.isDownloadSuccessful());
    }

    @When("^I initiate the document export and open the downloaded Excel file$")
    public void iInitiateDocumentExportAndOpenExcel() {
        claimAccountingReportPage.initiateDocumentExport();
        claimAccountingReportPage.openDownloadedExcel();
    }

    @Then("^The Excel is generated without errors and the specified modifications are applied$")
    public void excelIsGeneratedWithoutErrors() {
        assertTrue(claimAccountingReportPage.isExcelGeneratedCorrectly());
    }
}