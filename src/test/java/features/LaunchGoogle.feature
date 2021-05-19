Feature: Login Module

Scenario Outline: Enter Text in a Search  Bar
Given User is on the Homepage
When The search bar is displayed
Then Enter "<UservVal>"

Examples:

|UservVal|
|Inayat|
|Inayat1|
|Inayat2|
