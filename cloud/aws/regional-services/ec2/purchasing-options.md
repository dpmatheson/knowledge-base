# Purchasing Options

* On-Demand Instances
  * Short workload, predictable pricing
  * Linux & Windows - billing per second after the first minute
  * Other OS - billing per hour
  * Highest cost but not upfront payment
  * No long-term commitment
  * Recommended for short-term uninterrupted workloads where you can't predict how the application will behave
* Reserved (1 & 3 years)
  * Reserved Instances - long workloads
    * Up to 72% discount compared to On-Demand
    * Reserve a specific instance attributes (Intsance Type, Region, Tenancy, OS)
    * Reservation Period - 1 year discount, 3 years bigger discount
    * Payment Options - discount depends on No Upfront, Partial Upfront or Full Upfront
    * Reserved Instance's Scope - Regional or Zonal
    * Recommended for steady state usage applications (e.g. databases)
    * You can buy & sell in the Reserved Instance Marketplace
  * Convertible Reserved Instance - long workloads with flexible instances
    * Can change the EC2 instance type, instance family, OS, scope and tenancy
    * Less of a discount for more flexibility
* Savings Plans (1 & 3 years)
  * Commitment to an amount of usage, long workload
  * Discount based on long-term usage (same as Reserved Instances)
  * Commit to a certain type of usage (e.g. $10/hour for 1 or 3 years)
  * Usage beyong EC2 Savings Plan is billed at the On-Demand price
  * Locked into a specific instance family & AWS Region (e.g. M5 in us-east-1)
  * Flexible across:
    * Instance size (e.g. m5.xlarge, m5.2xlarge)
    * OS (e.g. Linux, Windows)
    * Tenancy (Host, Dedicated, Default)
* Spot Instances
  * Short workloads, cheap, can lose instances (less reliable)
  * Up to 90% discount compared to On-Demand
  * Instances you can lose at any point of time if your max price is less than the current Spot price
  * Most cost efficient instances in AWS
  * Useful for workloads which are resilient to failure
    * Batch jobs
    * Data analysis
    * Image processing
    * Any distributed workloads
    * Workloads with a flexible start and end time
  * Not suitable for critical jobs or databases
* Dedicated Hosts
  * Book an entire physical server, control instance placement
  * Address compliance requirements and use your server bound software licenses (per-socket, per-core, per-VM etc)
  * Purchasing Options:
    * On-demand - pay per second
    * Reserved - 1 or 3 year (No Upfront, Partial Upfront, Full Upfront payment)
  * Most expensive option on AWS
* Dedicated Instances
  * No other customers will share your hardware
  * May share hardware with other instances in the same account
  * No control over instance placement (can move hardware after Stop/Start)

| Characteristics                                     | Dedicated Instances | Dedicated Hosts |
| --------------------------------------------------- | ------------------- | --------------- |
| Enabled use of dedicated physical servers           | Yes                 | Yes             |
| Per instance billing (subject to $2 per region fee) | Yes                 | No              |
| Per host billing                                    | No                  | Yes             |
| Visibility of sockets, cores, host ID               | No                  | Yes             |
| Affinity between a host and instances               | No                  | Yes             |
| Targeted instance placement                         | No                  | Yes             |
| Automatic Instance Placement                        | Yes                 | Yes             |
| Add capacity using an allocation request            | No                  | Yes             |

* Capacity Reservations
  * Reserve On-Demand instances capacity in a specific AZ for any duration
  * Always have access to EC2 capacity when you need it
  * No time commitment (create/cancel any time), no billing discounts
  * Combine with Regional Reserved Instances and Savings Plans to benefit from billing discounts
  * You're charged at the On-Demand rate whether you run instances or not
  * Suitable for short-term, uninterrupted workloads that needs to be in a specific AZ
