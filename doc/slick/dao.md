### slick的简单应用

---

* 增加

```scala
  def insertEmployeeTemp(employeeTempRow: EmployeeTempRow):Future[EmployeeTempRow] = {
    db.run(employeeTempTab returning employeeTempTab += employeeTempRow)
  }
```



* 删除
* 修改
* 查询

```scala
  /*返回对应的第一个值*/
  def validateCompany(userId:String,companyId:String) ={
    db.run(employeeTab.filter(_.id === userId).result.headOption)
  }

return value:
Success(Some(EmployeeRow(57613bac5eac323cad473d28,涛皮儿,13810625240,None,None,None,None,None,None,分贝管理员,启用,None,None)))
```

