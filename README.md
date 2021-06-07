
## Token Bucket Algorithm

![token-bucket-image](https://miro.medium.com/max/1400/1*_tuX7nBlZpvmpElBHc3T2Q.png "TOKEN BUCKET PICTORIAL REPRESENTATION")

Assume that we have a bucket, the capacity is defined as the number of tokens that it can hold. Whenever a consumer wants to access an API endpoint, it must get a token from the bucket. Token is removed from the bucket if it's available and accept the request. If the token is not available then the server rejects the request.

As requests are consuming tokens, we also need to refill them at some fixed rate and time, such that we never exceed the capacity of the bucket. Let's consider an API that has a rate limit of 100 requests per minute. We can create a bucket with a capacity of 100, and a refill rate of 100 tokens per minute.

Please refer to the [Understanding Rate Limiting Algorithms](https://bhargav-journal.blogspot.com/2020/12/understanding-rate-limiting-algorithms.html) blog where the Token Bucket and other algorithms have been explained in detail.

## Token Bucket Algorithm - RateLimiter Spring Boot Project

Refer to the [Rate Limiter Implementation - Token Bucket Algorithm](https://bhargav-journal.blogspot.com/2020/12/rate-limiter-token-bucket.html) for step by step implementation details.
