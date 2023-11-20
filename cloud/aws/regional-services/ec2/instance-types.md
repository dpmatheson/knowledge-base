# Instance Types



{% embed url="https://aws.amazon.com/ec2/instance-types/" %}

Instance comparisson: [https://instances.vantage.sh/](https://instances.vantage.sh/)

### Naming Convention

* <mark style="color:blue;">**m**</mark><mark style="color:orange;">**5**</mark>**.**<mark style="color:green;">**2xlarge**</mark>
  * <mark style="color:blue;">**m**</mark>: instance class
  * <mark style="color:orange;">**5**</mark>: generation (AWS improves them over time)
  * <mark style="color:green;">**2xlarge**</mark>: size within the instance class

### General Purpose

* Greate for diverse workloads, webservers, code repos etc
* Balance between
  * Compute
  * Memory
  * Networking
* Instance class 'T' and 'M'

### Compute Optimised

* Great for compute-intensive tasks that need high performance processors
* Use cases:
  * Batch processing workloads
  * Media transcoding
  * High performance web servers
  * High performance computing (HPC)
  * Scientific modeling & machine learning
  * Dedicated gaming servers
* Instance class 'C'

### Memory Optimised

* Fast performance for workloads that process large data sets in memory
* Use cases:
  * High performance, relational/non-relational databases
  * Distributed web scale cache stores
  * In-memory databases for BI
  * Applications performing real-time processing of big unstructured data
* Instance class 'R', 'X', and 'Z'

### Storage Optimised

* For storage intensive tasks that require high, sequential read and write access to large data sets on local storage
* Use cases:
  * High frequency online transaction processing (OLTP) systems
  * Relational and NoSQL databases
  * Cache for in-memory databases (e.g. Redis)
  * Data warehousing applications
  * Distributed file systems
* Instance class 'I', 'D', 'H'
