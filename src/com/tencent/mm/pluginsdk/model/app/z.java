package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;
import java.util.Iterator;
import java.util.LinkedList;

public final class z
  implements x
{
  private com.tencent.mm.o.x cDg;
  private cr dWq;
  private ab huU;
  private Context mContext;

  private z(Context paramContext, ab paramab)
  {
    this.mContext = paramContext;
    this.huU = paramab;
  }

  public static void a(Context paramContext, ab paramab)
  {
    z localz = new z(paramContext, paramab);
    SharedPreferences localSharedPreferences = ak.aHj();
    String str2;
    if (localSharedPreferences != null)
    {
      str2 = localSharedPreferences.getString("key_app_ids_registion_while_not_login", "");
      if (!ch.jb(str2))
        break label141;
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpJX+KZ6umzqt7wl5hsBuqkd", "no saved appids while not login");
    }
    LinkedList localLinkedList1;
    label141: LinkedList localLinkedList2;
    for (Object localObject1 = null; ; localObject1 = localLinkedList2)
    {
      localObject2 = null;
      if (localObject1 == null)
        break label237;
      boolean bool = localObject1.isEmpty();
      localObject2 = null;
      if (bool)
        break label237;
      localLinkedList1 = new LinkedList();
      Iterator localIterator = localObject1.iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        k localk = l.F(str1, false);
        if ((localk == null) || (localk.field_status == 0))
          localLinkedList1.add(str1);
      }
      String[] arrayOfString = str2.split("\\|");
      if ((arrayOfString == null) || (arrayOfString.length <= 0))
        break;
      localLinkedList2 = new LinkedList();
      int i = arrayOfString.length;
      int j = 0;
      int k = 1;
      while (j < i)
      {
        String str3 = arrayOfString[j];
        if (!ch.jb(str3))
        {
          localLinkedList2.add(str3);
          k++;
        }
        if (k > 5)
          break;
        j++;
      }
    }
    Object localObject2 = localLinkedList1;
    label237: if ((localObject2 == null) || (localObject2.isEmpty()))
    {
      com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpIw1vCoUyRMKQjZ1dpQIMvamblCzn1RUg4=", "no saved appids, just callback");
      l.ayF();
      if (localz.huU != null)
        localz.huU.arz();
      return;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localObject2.size());
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpIw1vCoUyRMKQjZ1dpQIMvamblCzn1RUg4=", "now do batch get appinfos, appid liSst size is :%d", arrayOfObject);
    bf.Uq().a(7, localz);
    bf.aza().S(localObject2);
    Context localContext = localz.mContext;
    localz.mContext.getString(n.buo);
    localz.dWq = e.a(localContext, localz.mContext.getString(n.buA), true, new aa(localz));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, ac paramac)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpIw1vCoUyRMKQjZ1dpQIMvamblCzn1RUg4=", "OnScenEnd, errType = %d, errCode = %d", arrayOfObject);
    bf.Uq().b(7, this);
    if ((this.dWq != null) && (this.dWq.isShowing()))
    {
      this.dWq.dismiss();
      this.dWq = null;
    }
    if (this.huU != null)
      this.huU.arz();
    l.ayF();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.z
 * JD-Core Version:    0.6.2
 */