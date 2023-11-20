# Policies

### Policies Inheritance

* Group of Developers with attached policy at group level, every member will inherit policy
* Group of Operations with attached policy at group level, every member will inherit policy
* Standalone user not part of the group, can have **Inline policy attached** to user.
* Audit team policy attached to members from each of Developers and Operations, those members will also inherit from policy in addition to permissions from other policies.

### Policy Structure

* Consists of
  * **Version**: policy language version ("2012-10-17")
  * **Id**: an identifier for the policy (optional)
  * **Statement**: one or more individual statements (required)
* Statements consist of
  * **Sid**: an identifier for the statement (optional)
  * **Effect**: where the statement allows or denies access (Allow, Deny)
  * **Principle**: account/user/role to which this policy applies to
  * **Action**: list of actions this policy allows or denies
  * **Resource**: list of resources to which the actions are applied to
  * **Condition**: conditions for when this policy is in effect (optional)

<figure><img src="../../../../.gitbook/assets/image (1).png" alt="" width="375"><figcaption></figcaption></figure>

