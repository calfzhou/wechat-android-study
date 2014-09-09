package com.tencent.mm.ui.tools;

import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.cm;

public class fj
{
  private final String TAG;
  private MenuItem ePO = null;
  private ge jUA;
  private boolean jUB = true;
  private fw jUC;
  private boolean jUt = false;
  private boolean jUu = false;
  private boolean jUv = false;
  private boolean jUw = true;
  private boolean jUx = true;
  protected bs jUy = null;
  private fx jUz;
  private cm jzh = new cm(Looper.getMainLooper());

  public fj()
  {
    this.jUB = true;
    this.jUt = false;
    this.TAG = ("MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis()));
  }

  public fj(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.jUB = paramBoolean1;
    this.jUt = true;
    this.TAG = ("MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis()));
  }

  public final void Dk(String paramString)
  {
    if (this.jUy == null)
      return;
    this.jUy.Dk(paramString);
  }

  public final void a(FragmentActivity paramFragmentActivity)
  {
    com.tencent.mm.sdk.platformtools.z.d(this.TAG, "doNewExpand, searchViewExpand " + this.jUu);
    if (!this.jUu)
    {
      this.jUu = true;
      this.jzh.post(new fu(this, paramFragmentActivity));
      if (this.jUz != null)
        this.jUz.DS();
    }
  }

  public void a(FragmentActivity paramFragmentActivity, Menu paramMenu)
  {
    String str = this.TAG;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Boolean.valueOf(this.jUu);
    arrayOfObject[1] = Boolean.valueOf(this.jUv);
    arrayOfObject[2] = Boolean.valueOf(this.jUw);
    com.tencent.mm.sdk.platformtools.z.v(str, "on prepare options menu, searchViewExpand %B, triggerExpand %B, canExpand %B", arrayOfObject);
    if (paramFragmentActivity == null)
      com.tencent.mm.sdk.platformtools.z.w(this.TAG, "on hanle status fail, activity is null");
    do
    {
      return;
      this.ePO = paramMenu.findItem(i.aDT);
      if (this.ePO == null)
      {
        com.tencent.mm.sdk.platformtools.z.w(this.TAG, "can not find search menu, error");
        return;
      }
    }
    while ((!this.jUw) || ((!this.jUu) && (!this.jUv)));
    this.jUv = false;
    for (int i = 0; i < paramMenu.size(); i++)
    {
      MenuItem localMenuItem = paramMenu.getItem(i);
      if (localMenuItem.getItemId() != i.aDT)
        localMenuItem.setVisible(false);
    }
    this.jzh.post(new fr(this, paramFragmentActivity));
  }

  public final void a(fx paramfx)
  {
    this.jUz = paramfx;
  }

  public final void a(ge paramge)
  {
    this.jUA = paramge;
    if (this.jUy != null)
      this.jUy.a(paramge);
  }

  public final String aAn()
  {
    if (this.jUy != null)
      return this.jUy.aAn();
    return "";
  }

  protected boolean aFh()
  {
    return false;
  }

  protected void aFi()
  {
  }

  protected void aFj()
  {
  }

  public final boolean aXw()
  {
    return this.jUu;
  }

  public final boolean aZB()
  {
    if (this.jUy != null)
      return this.jUy.aZB();
    return false;
  }

  public final boolean aZC()
  {
    if (this.jUy != null)
      return this.jUy.aZC();
    return false;
  }

  public final void b(FragmentActivity paramFragmentActivity)
  {
    com.tencent.mm.sdk.platformtools.z.d(this.TAG, "doNewCollapse, searchViewExpand " + this.jUu);
    if (this.jUu)
    {
      this.jUu = false;
      aFj();
      if (this.jUy != null)
        this.jUy.ga(false);
      this.jzh.post(new fv(this, paramFragmentActivity));
      if (this.jUz != null)
        this.jzh.post(new fl(this));
    }
    this.jzh.post(new fm(this, paramFragmentActivity));
  }

  public final void b(FragmentActivity paramFragmentActivity, Menu paramMenu)
  {
    com.tencent.mm.sdk.platformtools.z.v(this.TAG, "on create options menu");
    if (paramFragmentActivity == null)
    {
      com.tencent.mm.sdk.platformtools.z.w(this.TAG, "on add search menu, activity is null");
      return;
    }
    if (this.jUy == null)
    {
      if (this.jUB)
        this.jUy = new ActionBarSearchView(paramFragmentActivity);
    }
    else
    {
      this.jUy.a(new fk(this));
      this.jUy.dZ(aFh());
      this.jUy.setOnEditorActionListener(new fn(this));
      this.ePO = paramMenu.add(0, i.aDT, 0, n.btf);
      this.ePO.setEnabled(this.jUw);
      this.ePO.setIcon(h.QO);
      android.support.v4.view.z.a(this.ePO, (View)this.jUy);
      if (!this.jUt)
        break label242;
      android.support.v4.view.z.a(this.ePO, 9);
      label172: if (!this.jUt)
        break label253;
      android.support.v4.view.z.a(this.ePO, new fo(this, paramFragmentActivity));
    }
    while (true)
    {
      this.jUy.a(new fq(this));
      return;
      this.jUy = new SearchViewNotRealTimeHelper(paramFragmentActivity);
      this.jUy.a(this.jUA);
      break;
      label242: android.support.v4.view.z.a(this.ePO, 2);
      break label172;
      label253: this.jUC = new fp(this, paramFragmentActivity);
    }
  }

  public final void baM()
  {
    gk(true);
  }

  public final void baN()
  {
    com.tencent.mm.sdk.platformtools.z.d(this.TAG, "do collapse");
    if ((this.jUu) && (this.ePO != null))
    {
      if (!this.jUt)
        break label40;
      android.support.v4.view.z.e(this.ePO);
    }
    label40: 
    while (this.jUC == null)
      return;
    this.jUC.cu();
  }

  public final void clearFocus()
  {
    if (this.jUy != null)
      this.jUy.aZA();
  }

  public final void gk(boolean paramBoolean)
  {
    String str = this.TAG;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(this.jUu);
    MenuItem localMenuItem = this.ePO;
    boolean bool = false;
    if (localMenuItem == null)
      bool = true;
    arrayOfObject[1] = Boolean.valueOf(bool);
    com.tencent.mm.sdk.platformtools.z.d(str, "do expand, expanded[%B], search menu item null[%B]", arrayOfObject);
    if (this.jUu)
      return;
    if (!this.jUw)
    {
      com.tencent.mm.sdk.platformtools.z.w(this.TAG, "can not expand now");
      return;
    }
    this.jUx = paramBoolean;
    if (this.ePO != null)
    {
      this.jzh.post(new ft(this));
      return;
    }
    this.jUv = true;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    String str = this.TAG;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Boolean.valueOf(this.jUu);
    com.tencent.mm.sdk.platformtools.z.v(str, "on key down, key code %d, expand %B", arrayOfObject);
    if ((4 == paramInt) && (this.jUu))
    {
      baN();
      return true;
    }
    return false;
  }

  public final void setHint(CharSequence paramCharSequence)
  {
    if (this.jUy == null)
      return;
    this.jUy.setHint(paramCharSequence);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fj
 * JD-Core Version:    0.6.2
 */