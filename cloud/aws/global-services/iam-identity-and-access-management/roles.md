# Roles

* Some AWS services will need to perform actions on your behalf
* We can assign permissions to AWS services with IAM Roles
* For example, an EC2 instance may want to perform actions on AWS
  * Give permissions to the EC2 instance via an IAM Role
  * EC2 instance will use IAM Role to access AWS&#x20;
  * Common roles:
    * EC2 Instance Roles
    * Lambda Function Roles
    * Roles for CloudFormation
  * Create a Role via the console
    * Select the Trusted entity type (AWS service to select a particular service)
    * Choose Service/Use case - EC2
    * Attach Permissions policy to the Role (e.g. IAMReadOnlyAccess)
