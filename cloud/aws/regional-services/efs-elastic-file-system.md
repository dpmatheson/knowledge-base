# EFS - Elastic File System

* Managed NFS (network file system) which can be mounted on many EC2 Instances
* EFS works with EC2 instances in multi-AZ
* Highly available, scalable, expensive (3xgp2), pay per use
* Use cases: content management, web serving, data sharing, Wordpress
* Uses NFSv4.1 protocol
* Uses Security Group to control access to EFS
* Compatible with Linux based AMI (not Windows)
* Encryption at rest using KMS
* POSIX file system which has a standard file API
* File system scales automatically, pay-per-use, no capacity planning

### EFS - Performance & Storage Classes

* EFS Scale
  * 1000s of concurrent NFS clients, 10 GB+/s throughput
  * Grow to Petabyte-scale network file system, automatically
* Performance Mode (set at EFS creation time)
  * General Purpose (default) - latency sensitive use cases (web server, CMS etc)
  * Max I/O - higher latency, throughput, highly parallel (big data, media processing)
* Throughput Mode
  * Bursting - 1TB = 50MiB/s + burst of up to 100MiB/s
  * Provisioned - set your throughput regardless of storage size, e.g. 1GiB/s for 1TB storage
  * Elastic - automatically scales throughput up or down based on your workloads
    * Up to 3GiB/s for reads, 1GiB/s writes
    * Used for unpredictable workloads

### EFS - Storage Classes

* Storage Tiers (Lifecycle managment feature - move file after N days)
  * Standard: for frequently accessed files
  * Infrequent access (EFS-IA): cost to retrieve files, lower price to store. Enable with a Lifecycle Policy
* Availability and Durability
  * Standard: Multi-AZ, great for prod
  * One Zone: One AZ, great for dev, backup enabled by default, compatible with IA (EFS One Zone-IA)
* Over 90% in cost savings

