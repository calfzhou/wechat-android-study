package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ar;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.protocal.a.qy;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.friend.FindMContactAddUI;
import java.util.Iterator;
import java.util.LinkedList;

final class bj
  implements m
{
  bj(FindMContactLearmMoreUI paramFindMContactLearmMoreUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (FindMContactLearmMoreUI.c(this.jkM) != null)
    {
      FindMContactLearmMoreUI.c(this.jkM).dismiss();
      FindMContactLearmMoreUI.d(this.jkM);
    }
    if (FindMContactLearmMoreUI.e(this.jkM) != null)
    {
      bg.qX().b(431, FindMContactLearmMoreUI.e(this.jkM));
      FindMContactLearmMoreUI.f(this.jkM);
    }
    LinkedList localLinkedList;
    int k;
    int n;
    int j;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localLinkedList = ((ar)paramx).wD();
      az.c(localLinkedList);
      if ((localLinkedList == null) || (localLinkedList.size() <= 0))
        break label416;
      Iterator localIterator = localLinkedList.iterator();
      k = 0;
      while (localIterator.hasNext())
      {
        qy localqy = (qy)localIterator.next();
        if (localqy != null)
        {
          if (localqy.dZy != 1)
            break label409;
          n = k + 1;
          k = n;
        }
      }
      if (k > 0)
        j = 1;
    }
    while (true)
    {
      Object[] arrayOfObject2 = new Object[2];
      if (localLinkedList == null);
      for (int m = 0; ; m = localLinkedList.size())
      {
        arrayOfObject2[0] = Integer.valueOf(m);
        arrayOfObject2[1] = Integer.valueOf(k);
        z.d("!56@/B4Tb64lLpIaEkywMHoqAF50wwoU6aq9UNpxJDP2H8v06EipWcMmmw==", "tigerreg data size=%d, addcount=%s", arrayOfObject2);
        if ((FindMContactLearmMoreUI.g(this.jkM) == null) || (!FindMContactLearmMoreUI.g(this.jkM).contains("1")) || (j == 0))
          break label336;
        b.jE("R300_300_phone");
        Intent localIntent = new Intent(this.jkM, FindMContactAddUI.class);
        localIntent.putExtra("regsetinfo_ticket", FindMContactLearmMoreUI.h(this.jkM));
        localIntent.putExtra("regsetinfo_NextStep", FindMContactLearmMoreUI.g(this.jkM));
        localIntent.putExtra("regsetinfo_NextStyle", FindMContactLearmMoreUI.i(this.jkM));
        localIntent.putExtra("login_type", 0);
        MMWizardActivity.j(this.jkM, localIntent);
        return;
        j = 0;
        break;
      }
      label336: FindMContactLearmMoreUI.b(this.jkM);
      return;
      FindMContactLearmMoreUI localFindMContactLearmMoreUI1 = this.jkM;
      FindMContactLearmMoreUI localFindMContactLearmMoreUI2 = this.jkM;
      int i = n.btk;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      Toast.makeText(localFindMContactLearmMoreUI1, localFindMContactLearmMoreUI2.getString(i, arrayOfObject1), 0).show();
      FindMContactLearmMoreUI.b(this.jkM);
      return;
      label409: n = k;
      break;
      label416: j = 0;
      k = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bj
 * JD-Core Version:    0.6.2
 */