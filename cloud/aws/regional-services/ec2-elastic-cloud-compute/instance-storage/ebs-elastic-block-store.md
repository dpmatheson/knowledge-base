# EBS - Elastic Block Store

### EBS - Elastic Block Store

* Volume is a network drive you can attach to your instances while they run
* Allows your instance to persist data, even after EC2 Instance termination
* Bound to a specific availability zone
* Uses network to communicate with the instance, so there may be latency
* Can be detached from an EC2 instance and attached to another one quickly
* Locked to an Availability Zone
  * i.e. EBS Volume in us-east-1a cannot be attached to us-east-1b
  * To mobe a volume across, you first need to take a snapshot
* Have a provisioned capacity (size in GBs, and IOPS)
  * Billed for provisioned capacity
  * Can increase the capacity of the drive over time
* Multiple EBS Volumes can be attached to a single EC2 Instance
* EBS Volumes can be created unattached
* Delete on Termination attribute enabled for root volume by default, but not for additional volumes
* EBS Volume Types (6 types)
  * gp2/gp3 (SSD): general purpose SSD volume that balances price and performance
  * io1/io2 (SSD): Highest performance SSD volume for mission-critical, low-latency or high-throughput workloads
  * st1 (HDD): Low cost HDD volume designed for frequently access, throughput intensive workloads
  * sc1 (HDD): Lowest cost HDD volume for less frequently accessed workloads)
* EBS Volumes are characterised in Size/Throughput/IOPS
* Only gp2/gp3/io1/io2 can be used for boot volume

#### General Purpose SSD

* Cost effective storage, low-latency
* System boot volumes, Virtual Desktops, Development and Test environments
* 1GiB-16TiB
* gp3:
  * Baseline of 3,000 IOPS and throughput of 125 MiB/s
  * Can increase IOPS to 16,000 and throughput up to 1000MiB/s independently
* gp2:
  * Small gp2 volumes can burst to 3,000 IOPS
  * Size of volume and IOPS are linked, max IOPS is 16,000
  * 3 IOPS per GB, means at 5,334GB we are at the max IOPS

#### Provisioned IOPS (PIOPS) SSD

* Critical business applications with sustained IOPS performance
* Applications that need more then 16,000 IOPS
* Great for database workloads (sensitive to storage performance and consistency)
* io1/io2 (4GiB-16TiB)
  * Max PIOPS: 64,000 for Nitro EC2 instances & 32,000 for other
  * Can increate PIOPS independently from storage size
  * io2 have more durability and more IOPS per GiB (at the same price as io1)
* io2 Block Express (4GiB-64TiB)
  * Sub-millisecond latency
  * Max PIOPS: 256,000 with an IOPS:GiB ration of 1,000:1
* Supports EBS Multi-attach

#### Hard Disk Drives (HDD)

* Cannot be used as boot volume
* 125GiB to 16TiB
* Throughput Optimised HDD (st1)
  * Big Data, Data warehouse, Log Processing
  * Max throughput 500MiB/s - max IOPS 500
* Cold HDD (sc1)
  * For data which is infrequently accessed
  * Scenarios where lowest cost is important
  * Max throughput 250 MiB/s - max IOPS 250

{% embed url="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volume-types.html" %}

#### EBS Multi-Attach (io1/io2 family)

* Attach the same EBS volume to multiple EC2 instances in the same AZ
* Each instance has full read & write permissions to the high-performance volume
* Use case:
  * Achieve higher application availability in clustered Linux applications
  * Applications must manage concurrent write operations
* Up to 16 EC2 Instances at a time
* Must use a file system that's cluster-aware (not XFS, EXT4 etc)

### EBS Snapshots

* Make a backup (snapshot) of an EBS volume at a point in time
* Not necessary to detach volume to do a snapshot, but recommended
* Can copy snapshots across AZ or Region
* EBS Snapshot Archive
  * Move snapshot to an archive tier which is 75% cheaper
  * Takes 23-72 hours for restoring the archive
* Recycle Bin
  * Setup rules to retain deleted snapshots so you can recover them after accidental deletion
  * Specify retention from 1 day to 1 year
* Fast Snapshot Restore (FSR)
  * Force full initialisation of snapshot to have no latency on the first use (\$$$)
