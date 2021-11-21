### 《TiDB in Action》

- https://book.tidb.io/

- TiDB 有以下的一些优势：
  - 纯分布式架构，拥有良好的扩展性，支持弹性的扩缩容
  - 在大多数场景下可以直接替换 MySQL
  - 对于一些有强一致需求的场景友好，例如：银行转账
  - 具有丰富的工具链生态，覆盖数据迁移、同步、备份等多种场景

---

### TiKV

- 作为保存数据的系统，首先要决定的是数据的存储模型，也就是数据以什么样的形式保存下来。TiKV 的选择是 Key-Value 模型，并且提供有序遍历方法。
- TiKV 的 KV 存储模型和 SQL 中的 Table 无关!

### SQL 层

- TiDB 的 SQL 层，即 tidb-server，跟 Google 的 F1 比较类似，负责将 SQL 翻译成 Key-Value 操作，将其转发给共用的分布式 Key-Value 存储层 TiKV，然后组装 TiKV 返回的结果，最终将查询结果返回给客户端。
