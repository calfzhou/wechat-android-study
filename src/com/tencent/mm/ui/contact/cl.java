package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.q.a;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.m;
import com.tencent.mm.q.o;
import com.tencent.mm.q.q;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class cl extends LinearLayout
  implements o
{
  private Context context;
  private LinearLayout eSl = null;
  private List jzJ;
  private Map jzK;
  private cn jzL;

  public cl(Context paramContext, cn paramcn)
  {
    super(paramContext);
    this.context = paramContext;
    this.jzL = paramcn;
    init();
  }

  private void init()
  {
    m localm = aa.uY();
    ArrayList localArrayList = new ArrayList();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select rcontact.username");
    localStringBuilder.append(" from rcontact, bizinfo");
    localStringBuilder.append(" where rcontact.username").append(" = bizinfo.username");
    localStringBuilder.append(" and (rcontact.verifyFlag").append(" & ").append(com.tencent.mm.storage.i.aIi()).append(") != 0 ");
    localStringBuilder.append(" and (rcontact.type").append(" & 1) != 0 ");
    localStringBuilder.append(" and bizinfo.type").append(" = 2");
    String str1 = localStringBuilder.toString();
    z.d("!32@/B4Tb64lLpJBvWFKDfNn3fDJZ/Q78pVI", "getEnterpriseFatherBizLst sql %s", new Object[] { str1 });
    Cursor localCursor = localm.rawQuery(str1, new String[0]);
    if (localCursor != null)
    {
      if (localCursor.moveToFirst())
        do
          localArrayList.add(localCursor.getString(0));
        while (localCursor.moveToNext());
      localCursor.close();
    }
    this.jzJ = localArrayList;
    if ((this.jzJ == null) || (this.jzJ.size() <= 0))
      z.e("!44@/B4Tb64lLpIXzeB5NZbbB0Dbk9yEMsmyuH6azdalesY=", "bizList is null");
    while (true)
    {
      return;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.jzJ.size());
      z.d("!44@/B4Tb64lLpIXzeB5NZbbB0Dbk9yEMsmyuH6azdalesY=", "biz list size = %s", arrayOfObject);
      this.jzK = new HashMap();
      LinearLayout localLinearLayout = this.eSl;
      int i = 0;
      if (localLinearLayout == null)
      {
        View.inflate(getContext(), k.bez, this);
        this.eSl = ((LinearLayout)findViewById(com.tencent.mm.i.aoI));
      }
      while (i < this.jzJ.size())
      {
        String str2 = (String)this.jzJ.get(i);
        co localco = new co(getContext(), str2);
        this.eSl.addView(localco);
        this.jzK.put(str2, localco);
        if (i == -1 + this.jzJ.size())
          localco.findViewById(com.tencent.mm.i.arM).setBackgroundResource(h.WT);
        i++;
      }
    }
  }

  public final void a(q paramq)
  {
    if (paramq.dqN == null)
      return;
    if (!paramq.dqN.uh())
    {
      z.d("!44@/B4Tb64lLpIXzeB5NZbbB0Dbk9yEMsmyuH6azdalesY=", "onEvent, not enterprise father");
      return;
    }
    am.h(new cm(this, paramq));
  }

  public final int aXb()
  {
    if (this.jzJ == null)
      return 0;
    return this.jzJ.size();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cl
 * JD-Core Version:    0.6.2
 */