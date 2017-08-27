# hibernate-mysql-table-per-class-inheritance
A Simple Hibernate MySQL example explaining the TABLE PER CLASS inheritance concept

Points to Remember,

@GeneratedValue(strategy = GenerationType.TABLE)

In this strategy you are going to use one table per class and each one has an ID. In this case you will have to use the generation type as TABLE or else you will get this error if you use AUTO.

"Cannot use identity column key generation with <union-subclass>"
