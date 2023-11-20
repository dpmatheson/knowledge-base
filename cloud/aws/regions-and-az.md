# Regions & AZ

* AWS Regions
  * Regions all the world.
  * Names can be us-east-1, eu-west-3 etc.
  * Cluster of data centres.
  * Most AWS services are region scoped.

{% hint style="info" %}
How to choose an AWS Region?

* <mark style="color:blue;">**Compliance**</mark> with data governance and legal requirements: data never leaves a region without your explicit permission
* <mark style="color:blue;">**Proximity**</mark> to customers: reduce latency
* <mark style="color:blue;">**Available**</mark> services within a Region: new services and new features aren't available in every Region
* <mark style="color:blue;">**Pricing**</mark>: pricing varies region to region and is transparent in the service pricing page
{% endhint %}

* AWS Availability Zones (AZ)
  * Each region has many availability zones (usually 3, min 3, max 6).\
    e.g. ap-southeast-2a, ap-southeast-2b, ap-southeast-2c
  * Each AZ is one or more discrete data centres with redundant power, networking and connectivity.
  * Separate from each other so they are isolated from disasters.
  * Connected with hight bandwidth, ultra-low latency networking.
* AWS Data Centres
* AWS Edge Locations/Points of Presence
  * 400+ Points of Presence (400+ Edge Locations & 10+ Regional Caches) in 90+ cities across 40+ countries.
  * Content is delivered to end users with lower latency.

{% embed url="https://aws.amazon.com/about-aws/global-infrastructure/regions_az/" %}

{% embed url="https://aws.amazon.com/cloudfront/features" %}
