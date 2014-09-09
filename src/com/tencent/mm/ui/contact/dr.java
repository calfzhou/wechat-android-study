package com.tencent.mm.ui.contact;

import com.tencent.mm.modelsearch.k;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.cc;
import java.util.ArrayList;
import java.util.List;

final class dr
  implements k
{
  dr(dp paramdp)
  {
  }

  public final void a(List paramList1, List paramList2, String[] paramArrayOfString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramList1.size());
    z.i("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "search item %d", arrayOfObject);
    dp.bi(paramList1);
    dp.a(this.jBp, paramList1);
    dp.a(this.jBp);
    dp.b(this.jBp);
    dp.c(this.jBp);
    this.jBp.closeCursor();
    this.jBp.notifyDataSetChanged();
    if (dp.d(this.jBp) != null)
      dp.e(this.jBp).DT();
    if ((dp.f(this.jBp) != null) && (dp.g(this.jBp) != null))
      dp.g(this.jBp).pd(dp.h(this.jBp).size());
    this.jBp.aWL();
  }

  public final void jp(String paramString)
  {
    z.e("!56@/B4Tb64lLpIOk2wES7k2RU8dfo0rBgyiQD8y5jn/AoaIK2+kPB14OQ==", "!!!!!FTSSearch Occur Error: originQuery = %s", new Object[] { paramString });
    ArrayList localArrayList = new ArrayList();
    dp.bi(localArrayList);
    dp.a(this.jBp, localArrayList);
    dp.a(this.jBp);
    dp.b(this.jBp);
    dp.c(this.jBp);
    this.jBp.closeCursor();
    this.jBp.notifyDataSetChanged();
    if (dp.i(this.jBp) != null)
      dp.j(this.jBp).DT();
    if ((dp.f(this.jBp) != null) && (dp.g(this.jBp) != null))
      dp.g(this.jBp).pd(dp.h(this.jBp).size());
    this.jBp.aWL();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dr
 * JD-Core Version:    0.6.2
 */