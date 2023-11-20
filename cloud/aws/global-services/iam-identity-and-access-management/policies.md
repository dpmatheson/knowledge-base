# Policies

### Policies Inheritance

* Group of Developers with attached policy at group level, every member will inherit policy
* Group of Operations with attached policy at group level, every member will inherit policy
* Standalone user not part of the group, can have **Inline policy attached** to user.
* Audit team policy attached to members from each of Developers and Operations, those members will also inherit from policy in addition to permissions from other policies.
* A user can inherit from multiple policies as well as inline policies

### Policy Structure

* Consists of
  * **Version**: policy language version ("2012-10-17")
  * **Id**: an identifier for the policy (optional)
  * **Statement**: one or more individual statements (required)
* Statements consist of
  * **Sid**: an identifier for the statement (optional)
  * **Effect**: where the statement allows or denies access (Allow, Deny)
  * **Principle**: account/user/role to which this policy applies to
  * **Action**: list of actions this policy allows or denies (\* wildcard can expand to mean any resource, or all resources with a prefix)
  * **Resource**: list of resources to which the actions are applied to (\* wildcard can expand to mean any resource, or all resources with a prefix)
  * **Condition**: conditions for when this policy is in effect (optional)

<figure><img src="../../../../.gitbook/assets/image (1).png" alt="" width="375"><figcaption></figcaption></figure>

### Password Policy

* Strong passwords = higher security
* Can set:
  * Minimum password length
  * Require specific character types (include uppercase, lowercase, numbers, non-alphanumeric characters)
* Allow all IAM users to change their own passwords
* Require users to change their passwords after specified time (e.g. every 90 days)
* Prevent password reuse

### Multi Factor Authentication (MFA)

* Protect Root accounts and IAM users
* MFA = password you know + security device you own
* Main benefit: even if password stolen or hacked, the account is no compromised
* MFA Device options:
  * Virtual MFA device (Google Authenticator, Authy etc)
  * Universal 2nd Factor (U2F) Security Key (YubiKey)
  * Hardware Key Fob MFA Device (Provided by Gemalto)
  * Hardware Key Fob MFA Device for AWS GovCloud (US) (Provided by SurePassID)
