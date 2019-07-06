# 每天刷一道算法，如有中断且没有提前说的就不管了
## 在这个文件夹中以个人名全小写命名，如：huangshijie/toSum  toSum是算法名，由黄仕杰每天给出
### 算法的题目放在subject目录下，以年月日_项目名.md呈现，如20190630_toSum.md


# Git提交时忽略文件或者文件夹

### 在项目根目录下面 添加 .gitignore文件（这个文件我已经创建好了，在项目的根目录下）

### 文件中每一行表示需要忽略的文件的正则表达式。

#### 下面是我过滤的文件及文件夹

 ```xml
#过滤所有以.iml结尾的文件
*.iml
#过滤/huangshijie/java/leetcode/.idea 这里路劲的文件夹
/huangshijie/java/leetcode/.idea
#过滤/huangshijie/java/leetcode/out 这个路径的文件夹
/huangshijie/java/leetcode/out

 ```

你们只需要把这个文件拉下来，然后添加上自己要过滤的文件

```xml
/target/ ：过滤文件设置，表示过滤这个文件夹

*.mdb  ，*.ldb  ，*.sln 表示过滤某种类型的文件
/mtk/do.c ，/mtk/if.h  表示指定过滤某个文件下具体文件
 !*.c , !/dir/subdir/     !开头表示不过滤
 *.[oa]    支持通配符：过滤repo中所有以.o或者.a为扩展名的文件
```
文件上传提交
==========
群文件的Git文本里，先配置好Git，然后克隆本项目，git clone git@github.com:algorithmattachment/Algorith.git;或者直接GitHub上Fork项目，右上角；<br>
顺便添加一个远程仓库，以便往后更新方便使用，git remote add [名字自己随便取] git@github.com:algorithmattachment/Algorith.git(和上面的SSH连接一样的)；<br>
Fork 项目以后，你自己仓库里会有一个和本项目相同的项目，复制SSH链接，继续添加一个远程仓库 git remote add [名字还是随便取];<br>
##上述步骤完成后就可以修改创建提交自己的文件了<br>
有任何动作记得先 git add 添加到缓存区，然后 git commit 添加到本地仓库，然后就可以 git push 推送到远程仓库（这个是指你自己的远程仓库，就是添加的第二个远程仓库）,然后就可以Pull requests,黄仕杰审核以后会合并到他创建的那个仓库中，就算完成了。<br>
#文中使用的是SSH链接，都可以替换成HTTP链接，SSH链接免密，使用前记得配置好，群里文件写好了的



