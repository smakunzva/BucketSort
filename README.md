# BucketSort
This repo demonstrates the implementation of BucketSort algorithm. Backetsort algorithm:

a) Uses hashing and makes assumptions about the data

- Hashing the values we are sorting

How it works:

a) Distribute items based on their hashed values (Scattering). The hashing function must produce a bucket with  X-1 < X < X+1

b) sort items in the bucket

c) merge the buckets (gathering phase)

- It's a generalization of counting sort
