Feature: Export Claim Accounting Report

  Scenario: Export and Verify Structure of Claim Accounting Report
    Given I am logged into the system
    When I navigate to the 'Canned Reports > Module Claim > Report Code > Claim Accounting Report'
    And I follow the flow to 'Submit > View Log > Add Folio > Download Excel file'
    Then The system displays the flow correctly and allows the download of the Excel
    When I initiate the document export and open the downloaded Excel file
    Then The Excel is generated without errors and the specified modifications are applied