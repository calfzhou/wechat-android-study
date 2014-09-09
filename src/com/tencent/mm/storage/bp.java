package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.qd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Deprecated
public final class bp extends cg
{
  private List gfe;
  private qd ikv;

  public bp(List paramList)
  {
    super(new Object[0]);
    this.gfe = paramList;
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localLinkedList.add(((bq)localIterator.next()).aKz());
    this.ikv = new qd();
    this.ikv.huF = paramList.size();
    this.ikv.hQc = localLinkedList;
  }

  public final a aKx()
  {
    return this.ikv;
  }

  public final int getCmdId()
  {
    return 36;
  }

  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.gfe.iterator();
    while (localIterator.hasNext())
    {
      localStringBuffer.append(((bq)localIterator.next()).aKy());
      localStringBuffer.append(";");
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(123);
    arrayOfObject[1] = localStringBuffer.toString();
    return bc.j(arrayOfObject);
  }

  public final int wy()
  {
    return 123;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bp
 * JD-Core Version:    0.6.2
 */