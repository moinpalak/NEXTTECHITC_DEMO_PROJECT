Feature: Validate facebook login

Scenario Outline: facebook login

Given User visits facebook home page
When User enters valid "<email>" and valid "<password>"
When User clicks on iogin button
Then user will be able to successfully login.

Examples:
| email | password |
| palak_moin@yahoo.com | join2023 |
