# ECS Instance Store

### EC2 Instance Store

* EBS Volumes are network drives with good but limited performance
* If you need a high performance hardware disk, use EC2 Instance Store
* Better I/O performance
* EC2 Instance Store lose their storage if they are stopped (ephemeral)
* Good for buffer/cache/scratch data/temporary content
* Risk of data loss if hardware fails
* Backups & Replication are your responsibility
