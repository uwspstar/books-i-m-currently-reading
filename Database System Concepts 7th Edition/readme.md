---
marp: true
---

# Database System Concepts 7th Edition

by Abraham Silberschatz (Author), Henry Korth (Author), S. Sudarshan (Author)

![https://www.amazon.com/dp/1260084507](https://images-na.ssl-images-amazon.com/images/I/61aEyYvsBmL._AC_UL232_SR232,232_.jpg)

---

# Raft - Reliable, Replicated, Redundant, And Fault-Tolerant

- Raft 是一种用于替代 Paxos 的共识算法。相比于 Paxos，Raft 的目標是提供更清晰的逻辑分工使得算法本身能被更好地理解，同时它安全性更高，并能提供一些额外的特性。[1][2]:1Raft 能为在计算机集群之间部署有限状态机提供一种通用方法，并确保集群内的任意节点在某种状态转换上保持一致。Raft 算法的开源实现众多，在 Go、C++、Java 以及 Scala 中都有完整的代码实现。Raft 这一名字来源于"Reliable, Replicated, Redundant, And Fault-Tolerant"（“可靠、可复制、可冗余、可容错”）的首字母缩写。
