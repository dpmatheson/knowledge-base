# AMI

* AMI = Amazon Machine Image
* AMIs are a customisation of an EC2 Instance
  * You add your own software, configuration, OS, monitoring etc
  * Faster boot/configuratioj time because all your software and config is pre-packages
* AMIs are buil for a specific region (and can be copied across regions)
* You can launch EC2 instances from
  * A public AMI: AWS provided
  * Your own AMI: uyou make and maintain them yourself
  * An AWS Marketplace AMI: an AMI someone else made (and potentially sells)

### AMI Process (from an EC2 Instance)

* Start an EC2 instance and customise it
* Stop the instance (for data integrity)
* Build and AMI - this will also create EBS snapshots
* Launch instances from other AMIs
