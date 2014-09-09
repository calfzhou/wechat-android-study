package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView.OnEditorActionListener;
import java.util.WeakHashMap;

public class SearchView extends LinearLayout
  implements android.support.v7.a.b
{
  static final m qR = new m();
  View.OnKeyListener JR = new k(this);
  private final TextView.OnEditorActionListener JS = new l(this);
  private final AdapterView.OnItemClickListener JT = new b(this);
  private final AdapterView.OnItemSelectedListener JU = new c(this);
  private TextWatcher JV = new d(this);
  private final View.OnClickListener mOnClickListener = new j(this);
  private int pw;
  private View qA;
  private ImageView qB;
  private View qC;
  private View qD;
  private SearchView.SearchAutoComplete qE;
  private View qF;
  private ImageView qG;
  private boolean qH;
  private CharSequence qI;
  private boolean qJ;
  private boolean qK;
  private CharSequence qL;
  private CharSequence qM;
  private boolean qN;
  private int qO;
  private SearchableInfo qP;
  private Bundle qQ;
  private Runnable qS = new a(this);
  private Runnable qT = new e(this);
  private Runnable qU = new f(this);
  private final Intent qV;
  private final Intent qW;
  private final WeakHashMap qX = new WeakHashMap();
  private o qo;
  private n qp;
  private View.OnFocusChangeListener qr;
  private p qs;
  private View.OnClickListener qt;
  private boolean qu;
  private boolean qv;
  private android.support.v4.widget.a qw;
  private View qx;
  private View qy;
  private View qz;

  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(com.tencent.mm.k.baw, this, true);
    this.qx = findViewById(com.tencent.mm.i.aNg);
    this.qE = ((SearchView.SearchAutoComplete)findViewById(com.tencent.mm.i.aNC));
    this.qE.q(this);
    this.qC = findViewById(com.tencent.mm.i.aNo);
    this.qz = findViewById(com.tencent.mm.i.aNx);
    this.qA = findViewById(com.tencent.mm.i.aSg);
    this.qy = findViewById(com.tencent.mm.i.aNr);
    this.qB = ((ImageView)findViewById(com.tencent.mm.i.aNl));
    this.qD = findViewById(com.tencent.mm.i.aNG);
    this.qG = ((ImageView)findViewById(com.tencent.mm.i.aNw));
    this.qx.setOnClickListener(this.mOnClickListener);
    this.qB.setOnClickListener(this.mOnClickListener);
    this.qy.setOnClickListener(this.mOnClickListener);
    this.qD.setOnClickListener(this.mOnClickListener);
    this.qE.setOnClickListener(this.mOnClickListener);
    this.qE.addTextChangedListener(this.JV);
    this.qE.setOnEditorActionListener(this.JS);
    this.qE.setOnItemClickListener(this.JT);
    this.qE.setOnItemSelectedListener(this.JU);
    this.qE.setOnKeyListener(this.JR);
    this.qE.setOnFocusChangeListener(new g(this));
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, com.tencent.mm.p.cyy, 0, 0);
    boolean bool1 = localTypedArray1.getBoolean(com.tencent.mm.p.cyC, true);
    if (this.qu != bool1)
    {
      this.qu = bool1;
      y(bool1);
      df();
    }
    int i = localTypedArray1.getDimensionPixelSize(com.tencent.mm.p.cyB, -1);
    if (i != -1)
    {
      this.pw = i;
      requestLayout();
    }
    CharSequence localCharSequence = localTypedArray1.getText(com.tencent.mm.p.cyD);
    if (!TextUtils.isEmpty(localCharSequence))
    {
      this.qI = localCharSequence;
      df();
    }
    int j = localTypedArray1.getInt(com.tencent.mm.p.cyz, -1);
    if (j != -1)
      this.qE.setImeOptions(j);
    int k = localTypedArray1.getInt(com.tencent.mm.p.cyA, -1);
    if (k != -1)
      this.qE.setInputType(k);
    localTypedArray1.recycle();
    TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(paramAttributeSet, com.tencent.mm.p.cyO, 0, 0);
    boolean bool2 = localTypedArray2.getBoolean(com.tencent.mm.p.cyP, true);
    localTypedArray2.recycle();
    setFocusable(bool2);
    this.qV = new Intent("android.speech.action.WEB_SEARCH");
    this.qV.addFlags(268435456);
    this.qV.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.qW = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.qW.addFlags(268435456);
    this.qF = findViewById(this.qE.getDropDownAnchor());
    if (this.qF != null)
    {
      if (Build.VERSION.SDK_INT < 11)
        break label700;
      this.qF.addOnLayoutChangeListener(new h(this));
    }
    while (true)
    {
      y(this.qu);
      df();
      return;
      label700: this.qF.getViewTreeObserver().addOnGlobalLayoutListener(new i(this));
    }
  }

  private void A(boolean paramBoolean)
  {
    if (paramBoolean)
      post(this.qS);
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      removeCallbacks(this.qS);
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    }
    while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
  }

  private void B(boolean paramBoolean)
  {
    int i;
    if ((this.qK) && (!this.qv) && (paramBoolean))
    {
      i = 0;
      this.qy.setVisibility(8);
    }
    while (true)
    {
      this.qD.setVisibility(i);
      return;
      i = 8;
    }
  }

  private Intent a(Cursor paramCursor, int paramInt, String paramString)
  {
    try
    {
      str1 = q.a(paramCursor, "suggest_intent_action");
      if (str1 == null)
      {
        str1 = this.qP.getSuggestIntentAction();
        break label191;
        str2 = q.a(paramCursor, "suggest_intent_data");
        if (str2 == null)
          str2 = this.qP.getSuggestIntentData();
        if (str2 == null)
          break label204;
        String str3 = q.a(paramCursor, "suggest_intent_data_id");
        if (str3 == null)
          break label204;
        str2 = str2 + "/" + Uri.encode(str3);
        break label204;
        while (true)
        {
          String str4 = q.a(paramCursor, "suggest_intent_query");
          return a(str1, (Uri)localObject, q.a(paramCursor, "suggest_intent_extra_data"), str4, 0, null);
          Uri localUri = Uri.parse(str2);
          localObject = localUri;
        }
      }
    }
    catch (RuntimeException localRuntimeException1)
    {
      while (true)
      {
        String str1;
        String str2;
        Object localObject;
        try
        {
          int j = paramCursor.getPosition();
          i = j;
          new StringBuilder("Search suggestions cursor at row ").append(i).append(" returned exception.");
          return null;
        }
        catch (RuntimeException localRuntimeException2)
        {
          int i = -1;
          continue;
        }
        label191: if (str1 == null)
        {
          str1 = "android.intent.action.SEARCH";
          continue;
          label204: if (str2 == null)
            localObject = null;
        }
      }
    }
  }

  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    Intent localIntent = new Intent(paramString1);
    localIntent.addFlags(268435456);
    if (paramUri != null)
      localIntent.setData(paramUri);
    localIntent.putExtra("user_query", this.qM);
    if (paramString3 != null)
      localIntent.putExtra("query", paramString3);
    if (paramString2 != null)
      localIntent.putExtra("intent_extra_data_key", paramString2);
    if (this.qQ != null)
      localIntent.putExtra("app_data", this.qQ);
    if (paramInt != 0)
    {
      localIntent.putExtra("action_key", paramInt);
      localIntent.putExtra("action_msg", paramString4);
    }
    localIntent.setComponent(this.qP.getSearchActivity());
    return localIntent;
  }

  private void a(int paramInt, String paramString1, String paramString2)
  {
    Intent localIntent = a("android.intent.action.SEARCH", null, null, paramString2, 0, null);
    getContext().startActivity(localIntent);
  }

  private boolean aR(int paramInt)
  {
    boolean bool1;
    Intent localIntent;
    if (this.qs != null)
    {
      boolean bool2 = this.qs.gN();
      bool1 = false;
      if (bool2);
    }
    else
    {
      Cursor localCursor = this.qw.getCursor();
      if ((localCursor != null) && (localCursor.moveToPosition(paramInt)))
      {
        localIntent = a(localCursor, 0, null);
        if (localIntent == null);
      }
    }
    try
    {
      getContext().startActivity(localIntent);
      A(false);
      this.qE.dismissDropDown();
      bool1 = true;
      return bool1;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
        new StringBuilder("Failed launch activity: ").append(localIntent);
    }
  }

  private void dN()
  {
    qR.a(this.qE);
    qR.b(this.qE);
  }

  private int da()
  {
    return getContext().getResources().getDimensionPixelSize(com.tencent.mm.g.PX);
  }

  private boolean db()
  {
    return ((this.qH) || (this.qK)) && (!this.qv);
  }

  private void dc()
  {
    int i = 8;
    if ((db()) && ((this.qy.getVisibility() == 0) || (this.qD.getVisibility() == 0)))
      i = 0;
    this.qA.setVisibility(i);
  }

  private void dd()
  {
    int i = 1;
    int j;
    label35: int k;
    label47: Drawable localDrawable;
    if (!TextUtils.isEmpty(this.qE.getText()))
    {
      j = i;
      if ((j == 0) && ((!this.qu) || (this.qN)))
        break label85;
      ImageView localImageView = this.qB;
      k = 0;
      if (i == 0)
        break label90;
      localImageView.setVisibility(k);
      localDrawable = this.qB.getDrawable();
      if (j == 0)
        break label97;
    }
    label85: label90: label97: for (int[] arrayOfInt = ENABLED_STATE_SET; ; arrayOfInt = EMPTY_STATE_SET)
    {
      localDrawable.setState(arrayOfInt);
      return;
      j = 0;
      break;
      i = 0;
      break label35;
      k = 8;
      break label47;
    }
  }

  private void de()
  {
    post(this.qT);
  }

  private void df()
  {
    if (this.qI != null)
      this.qE.setHint(l(this.qI));
    String str;
    do
    {
      return;
      if (this.qP == null)
        break;
      int i = this.qP.getHintId();
      str = null;
      if (i != 0)
        str = getContext().getString(i);
    }
    while (str == null);
    this.qE.setHint(l(str));
    return;
    this.qE.setHint(l(""));
  }

  private void dg()
  {
    y(false);
    this.qE.requestFocus();
    A(true);
    if (this.qt != null)
      this.qt.onClick(this);
  }

  static boolean e(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation == 2;
  }

  private CharSequence l(CharSequence paramCharSequence)
  {
    if (!this.qu)
      return paramCharSequence;
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
    localSpannableStringBuilder.append(paramCharSequence);
    Resources localResources = getContext().getResources();
    TypedValue localTypedValue = new TypedValue();
    getContext().getTheme().resolveAttribute(com.tencent.mm.d.NI, localTypedValue, true);
    Drawable localDrawable = localResources.getDrawable(localTypedValue.resourceId);
    int i = (int)(1.25D * this.qE.getTextSize());
    localDrawable.setBounds(0, 0, i, i);
    localSpannableStringBuilder.setSpan(new ImageSpan(localDrawable), 1, 2, 33);
    return localSpannableStringBuilder;
  }

  private void m(CharSequence paramCharSequence)
  {
    this.qE.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.qE;
    if (TextUtils.isEmpty(paramCharSequence));
    for (int i = 0; ; i = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i);
      return;
    }
  }

  private void y(boolean paramBoolean)
  {
    boolean bool1 = true;
    int i = 8;
    this.qv = paramBoolean;
    int j;
    boolean bool2;
    label33: int k;
    if (paramBoolean)
    {
      j = 0;
      if (TextUtils.isEmpty(this.qE.getText()))
        break label112;
      bool2 = bool1;
      this.qx.setVisibility(j);
      z(bool2);
      View localView = this.qC;
      if (!paramBoolean)
        break label118;
      k = i;
      label61: localView.setVisibility(k);
      ImageView localImageView = this.qG;
      if (!this.qu)
        break label124;
      label81: localImageView.setVisibility(i);
      dd();
      if (bool2)
        break label129;
    }
    while (true)
    {
      B(bool1);
      dc();
      return;
      j = i;
      break;
      label112: bool2 = false;
      break label33;
      label118: k = 0;
      break label61;
      label124: i = 0;
      break label81;
      label129: bool1 = false;
    }
  }

  private void z(boolean paramBoolean)
  {
    int i = 8;
    if ((this.qH) && (db()) && (hasFocus()) && ((paramBoolean) || (!this.qK)))
      i = 0;
    this.qy.setVisibility(i);
  }

  public void clearFocus()
  {
    this.qJ = true;
    A(false);
    super.clearFocus();
    this.qE.clearFocus();
    this.qJ = false;
  }

  final void dh()
  {
    y(this.qv);
    de();
    if (this.qE.hasFocus())
      dN();
  }

  final void i(CharSequence paramCharSequence)
  {
    m(paramCharSequence);
  }

  public final void onActionViewCollapsed()
  {
    clearFocus();
    y(true);
    this.qE.setImeOptions(this.qO);
    this.qN = false;
  }

  public final void onActionViewExpanded()
  {
    if (this.qN)
      return;
    this.qN = true;
    this.qO = this.qE.getImeOptions();
    this.qE.setImeOptions(0x2000000 | this.qO);
    this.qE.setText("");
    dg();
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.qT);
    post(this.qU);
    super.onDetachedFromWindow();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.qP == null)
      return false;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.qv)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    switch (i)
    {
    default:
    case -2147483648:
    case 1073741824:
    case 0:
    }
    while (true)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), paramInt2);
      return;
      if (this.pw > 0)
      {
        j = Math.min(this.pw, j);
      }
      else
      {
        j = Math.min(da(), j);
        continue;
        if (this.pw > 0)
        {
          j = Math.min(this.pw, j);
          continue;
          if (this.pw > 0)
            j = this.pw;
          else
            j = da();
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    de();
  }

  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (this.qJ);
    while (!isFocusable())
      return false;
    if (!this.qv)
    {
      boolean bool = this.qE.requestFocus(paramInt, paramRect);
      if (bool)
        y(false);
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView
 * JD-Core Version:    0.6.2
 */