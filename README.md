# AED_Elixir

Design document

Enterprises:
Accounting Unit
Emergency Unit
Equipment Unit
Management Unit
Medicine Unit

Organizations:
Admin Organization
Ambulance Organization
Billing Organization
Doctor Organization
Emergency Organization
Equipment Organization
Lab Organization
Medicine Organization
Patient Organization
Person Organization
Receptionist Organization

Roles:
Accounting Admin Role
Admin Role
Ambulance Role
Billing Admin Role
Doctor Role
Emergency Admin Role
Emergency Doctor Role
Emergency User Role
Equipment Admin
Lab Assistant Role
Management Admin Role
Medicine Admin
Medicine User
Patient Role
Person Role
Receptionist Role
System Admin Role

Problem definition:
1.Every day, people face emergency medical issues that can occur anywhere and at any time. At the time, medical assistance was limited, and a person's life could be at risk.
2.  Fund allocation in any enterprise does not follow proper channels and must be routed properly and through a series of approvals.
3. The analysis of EMS injury data is a critical step in reducing the number of fatalities, and tracking the patient early can be life-saving.

Solution:
1.A system that connects pharmacists, ambulances, billing departments, hospital equipment, patients, and doctors to a single platform with flexible functionalities.
2. A platform where patients can remotely search for a particular doctor and book the appointment for the same and doctors are allotted according to the emergency issues.
3. A timely supply of medicines from pharmatics can help save the emergency patients.
5. The timely requests for lab reports from doctors can be reviewed and reported to patients.
6.Equipment or tool requests are correctly forwarded to Billing Organization and equipment are granted based on available funds, resulting in proper use of money and resources.

Work Requests:

AmbulanceWorkRequest
Status: Accept, Reject, Process, Complete 

BillingWorkRequest
Status: Acknowledge, Reject, Accept, Complete

DoctorWorkRequest
Status: Request Lab test

EmergencyPatientRequest
Status: Accept, Reject, Process, Complete 

EquipmentWorkRequest
Status: Request for equipment 

LabTestWorkRequest
Status: Accept, Reject, Process, Complete

Reporting Module:
JFree Chart library is used to populate the statistical charts
Steps followed:
Add equipment data to a dataset using DefaultPieDataset
Pass the dataset to createPieChart method of ChartFactory class
Pass the chart to a ChartFrame and make that visible on the panel. 

Engineering techniques followed:
Designed separate modules for business logic and userInterfaces
DB4O to store objects/instances of classes or business models 
Followed Object Oriented Principles like Inheritance.
