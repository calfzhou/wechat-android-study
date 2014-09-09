package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.modelsearch.c;
import com.tencent.mm.modelsearch.d;
import com.tencent.mm.modelsearch.h;
import com.tencent.mm.modelsearch.k;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class dc extends BaseAdapter
  implements k, al, as
{
  private String cNF = null;
  private Context context = null;
  private Cursor cursor = null;
  private List edM = null;
  private boolean fsF = false;
  private cm gQj = new cm();
  private Comparator gkY = new d();
  private SparseArray jAF = null;
  private dd jAG = null;
  private List jAH = null;

  public dc(Context paramContext)
  {
    this.context = paramContext;
    aXt();
    if (this.jAF == null)
      this.jAF = new SparseArray();
  }

  private void aXt()
  {
    if (this.edM == null)
      this.edM = new ArrayList();
    this.edM.add("weixin");
    this.edM.add("officialaccounts");
    this.edM.add("newsapp");
    for (String str : y.dko)
      this.edM.add(str);
    this.edM.add(x.pG());
    this.edM.add("weibo");
    this.edM.add("qqmail");
    this.edM.add("fmessage");
    this.edM.add("tmessage");
    this.edM.add("qmessage");
    this.edM.add("qqsync");
    this.edM.add("floatbottle");
    this.edM.add("lbsapp");
    this.edM.add("shakeapp");
    this.edM.add("medianote");
    this.edM.add("qqfriend");
    this.edM.add("readerapp");
    this.edM.add("newsapp");
    this.edM.add("blogapp");
    this.edM.add("facebookapp");
    this.edM.add("masssendapp");
    this.edM.add("meishiapp");
    this.edM.add("feedsapp");
    this.edM.add("voipapp");
    this.edM.add("filehelper");
    this.edM.add("officialaccounts");
    this.edM.add("helper_entry");
    this.edM.add("pc_share");
    this.edM.add("cardpackage");
    this.edM.add("voicevoipapp");
    this.edM.add("voiceinputapp");
    this.edM.add("linkedinplugin");
  }

  private void be(List paramList)
  {
    if ((paramList != null) && (paramList.size() != 0))
      for (int i = -1 + paramList.size(); i >= 0; i--)
        if (this.edM.contains(((h)paramList.get(i)).dBO))
          paramList.remove(i);
  }

  public final List Gb()
  {
    return this.edM;
  }

  public abstract void RM();

  public final void a(int paramInt, ap paramap, Object paramObject)
  {
    a((String)paramObject, null);
  }

  public final void a(dd paramdd)
  {
    this.jAG = paramdd;
  }

  public final void a(String paramString, ao paramao)
  {
    if (this.jAG != null);
    RM();
    if (this.jAG != null)
      this.jAG.DT();
  }

  public final void a(String paramString, int[] paramArrayOfInt)
  {
    if (this.fsF)
    {
      if ((paramString != null) && (paramString.length() != 0))
      {
        this.cNF = paramString;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.cNF;
        z.i("!44@/B4Tb64lLpLMjfaYlIwk4K4f6u33zwsZJ5Y0sMINaQE=", "search %s", arrayOfObject);
        c.a(this.cNF, paramArrayOfInt, this.gkY, this, this.gQj);
        return;
      }
      z.e("!44@/B4Tb64lLpLMjfaYlIwk4K4f6u33zwsZJ5Y0sMINaQE=", "search query error, query is null or empty");
      return;
    }
    a(null, null);
    notifyDataSetChanged();
  }

  public final void a(List paramList1, List paramList2, String[] paramArrayOfString)
  {
    this.jAH = paramList1;
    be(this.jAH);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramList1.size());
    z.i("!44@/B4Tb64lLpLMjfaYlIwk4K4f6u33zwsZJ5Y0sMINaQE=", "search result %d", arrayOfObject);
    a(null, null);
    notifyDataSetChanged();
  }

  public final boolean aXr()
  {
    return this.fsF;
  }

  protected final List aXs()
  {
    return this.jAH;
  }

  public final void aXu()
  {
    this.edM.remove("filehelper");
  }

  protected final void clearCache()
  {
    if (this.jAF != null)
      this.jAF.clear();
  }

  protected final void closeCursor()
  {
    if (this.cursor != null)
      this.cursor.close();
  }

  public final void fA(boolean paramBoolean)
  {
    this.fsF = paramBoolean;
  }

  protected final Context getContext()
  {
    return this.context;
  }

  public int getCount()
  {
    int i;
    if (this.fsF)
    {
      List localList = this.jAH;
      i = 0;
      if (localList != null)
        i = this.jAH.size();
    }
    Cursor localCursor;
    do
    {
      return i;
      localCursor = this.cursor;
      i = 0;
    }
    while (localCursor == null);
    return this.cursor.getCount();
  }

  protected final Cursor getCursor()
  {
    return this.cursor;
  }

  public Object getItem(int paramInt)
  {
    SparseArray localSparseArray = this.jAF;
    Object localObject = null;
    if (localSparseArray != null)
      localObject = this.jAF.get(paramInt);
    if (localObject == null)
      localObject = qv(paramInt);
    return localObject;
  }

  public long getItemId(int paramInt)
  {
    getItem(paramInt);
    return qw(paramInt);
  }

  public final void jp(String paramString)
  {
    z.i("!44@/B4Tb64lLpLMjfaYlIwk4K4f6u33zwsZJ5Y0sMINaQE=", "on search error originQuery = %s", new Object[] { paramString });
    this.jAH = new ArrayList();
    be(this.jAH);
    a(null, null);
    notifyDataSetChanged();
  }

  protected abstract Object qv(int paramInt);

  public abstract long qw(int paramInt);

  protected final void setCursor(Cursor paramCursor)
  {
    this.cursor = paramCursor;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dc
 * JD-Core Version:    0.6.2
 */