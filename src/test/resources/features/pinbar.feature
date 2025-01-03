@US_51
Feature: Learn the pinbar function
  Agile : As a user , i want to learn how to use the pinbar

Background:
  Given user is on homepage

   Scenario: Verify the link to learn how to use the space
     When user click on learn how to use this space link
     Then user should see "How To Use Pinbar" and user should see use the text "Use the pin icon on the right top corner of page to create fast access link in the pinbar."


     Scenario: Verify that  users see an image on the page.
       Then user should see an image with src "/bundles/oronavigation/images/pinbar-location.jpg"

