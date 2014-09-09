package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.x.d;
import java.util.ArrayList;

public final class co
  implements m
{
  private Context context;
  private ProgressDialog esI;
  private cs jJo;

  public co(Context paramContext, cs paramcs)
  {
    this.context = paramContext;
    this.jJo = paramcs;
  }

  private void Dc(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    d locald = new d(localArrayList);
    bg.qX().d(locald);
    Context localContext = this.context;
    this.context.getString(n.bPj);
    this.esI = e.a(localContext, this.context.getString(n.bPh), true, new cq(this, locald));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    if (TextUtils.isEmpty(paramString))
      paramString = "";
    arrayOfObject[2] = paramString;
    z.i("!56@/B4Tb64lLpJtMRMH2jRSdghVsn4FqgjSjw154pjf3+T/ppFmtTaxXw==", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", arrayOfObject);
    if (paramx.getType() != 489)
      return;
    if (this.esI != null)
    {
      this.esI.dismiss();
      this.esI = null;
    }
    bg.qX().b(489, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      z.i("!56@/B4Tb64lLpJtMRMH2jRSdghVsn4FqgjSjw154pjf3+T/ppFmtTaxXw==", "dealSendInviteSuccess");
      e.a(this.context, n.bPg, n.buo, new cr(this));
      return;
    }
    z.i("!56@/B4Tb64lLpJtMRMH2jRSdghVsn4FqgjSjw154pjf3+T/ppFmtTaxXw==", "dealSendInviteFail");
    this.jJo.fO(false);
  }

  public final void bK(String paramString1, String paramString2)
  {
    bg.qX().a(489, this);
    Cursor localCursor = az.xh().gx(paramString1);
    if (localCursor.getCount() <= 1)
      Dc(paramString2);
    while (true)
    {
      if (localCursor != null)
        localCursor.close();
      return;
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = new ArrayList();
      if (localCursor != null)
      {
        localCursor.moveToFirst();
        int i = localCursor.getCount();
        for (int j = 0; j < i; j++)
        {
          ad localad = new ad();
          localad.b(localCursor);
          localArrayList1.add(localad.field_googlegmail);
          localArrayList2.add(Integer.valueOf(j));
          localArrayList3.add(localad);
          localCursor.moveToNext();
        }
        localArrayList2.add(Integer.valueOf(-1));
      }
      Context localContext = this.context;
      String str = this.context.getResources().getString(n.bMX);
      this.context.getResources().getString(n.bsK);
      e.a(localContext, str, localArrayList1, localArrayList2, new cp(this, localArrayList3));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.co
 * JD-Core Version:    0.6.2
 */