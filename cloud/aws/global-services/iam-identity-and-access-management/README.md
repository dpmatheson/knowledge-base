# IAM - Identity & Access Management

### Users & Groups

* Root account created by default, shouldn't be used or shared.
* Users are people within your organistion and can be grouped.
* Groups can only contain users, not other groups.
* Users don't have to belong to a group, and a user can belong to multiple groups.

### Permissions

* Users or Groups can be assigned JSON documents called policies
* &#x20; The policies define permissions of the users
* Apply the **least privileged principle**; don't give more permissions than a user needs.

<figure><img src="../../../../.gitbook/assets/image (1).png" alt="" width="375"><figcaption></figcaption></figure>

### Guidelines & Best Practices

* Don't use the root account except for AWS account setup
* One physical user = One AWS user (don't share accounts)
* Assign users to groups and permissions to groups
* Strong password policy
* Use and enforce MFA
* Create and use Roles for giving permissions to AWS services
* Use Access Keys for programmatic access (CLI/SDK)
* Audit permissions of your account using IAM Credentials Report and IAM Access Advisor
* Never share IAM users & Access Keys
