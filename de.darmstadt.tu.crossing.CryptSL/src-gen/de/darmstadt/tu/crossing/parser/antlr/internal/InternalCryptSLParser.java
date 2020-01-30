package de.darmstadt.tu.crossing.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.darmstadt.tu.crossing.services.CryptSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCryptSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_META_VARIABLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SPEC'", "'REFINES'", "'{'", "'}'", "'define'", "'='", "';'", "'add'", "'constraint'", "'ABSTRACT'", "'[]'", "'<'", "'>'", "'OBJECTS'", "'FORBIDDEN'", "'EVENTS'", "'ORDER'", "'CONSTRAINTS'", "'REQUIRES'", "'ENSURES'", "'NEGATES'", "'*'", "','", "'?'", "'=>'", "'('", "')'", "'.'", "':'", "');'", "'_'", "':='", "'|'", "'+'", "'||'", "'&&'", "'<='", "'>='", "'-'", "'%'", "'/'", "'neverTypeOf'", "'['", "']'", "'noCallTo'", "'callTo'", "'notHardCoded'", "'length'", "'instanceOf'", "'^'", "'true'", "'false'", "'!'", "'=='", "'!='", "'in'", "'elements('", "'alg('", "'mode('", "'pad('", "'part('", "'...'", "'after'", "'this'", "'extends'", "'&'", "'super'", "'import'", "'static'", "'extension'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_META_VARIABLE=7;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCryptSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCryptSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCryptSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCryptSL.g"; }



     	private CryptSLGrammarAccess grammarAccess;

        public InternalCryptSLParser(TokenStream input, CryptSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected CryptSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalCryptSL.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalCryptSL.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalCryptSL.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainmodelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainmodel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalCryptSL.g:71:1: ruleDomainmodel returns [EObject current=null] : (this_MetaCrysl_0= ruleMetaCrysl | this_Refinement_1= ruleRefinement ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject this_MetaCrysl_0 = null;

        EObject this_Refinement_1 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:77:2: ( (this_MetaCrysl_0= ruleMetaCrysl | this_Refinement_1= ruleRefinement ) )
            // InternalCryptSL.g:78:2: (this_MetaCrysl_0= ruleMetaCrysl | this_Refinement_1= ruleRefinement )
            {
            // InternalCryptSL.g:78:2: (this_MetaCrysl_0= ruleMetaCrysl | this_Refinement_1= ruleRefinement )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_ID) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==13) ) {
                        alt1=2;
                    }
                    else if ( ((LA1_3>=22 && LA1_3<=23)||LA1_3==25||LA1_3==39) ) {
                        alt1=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCryptSL.g:79:3: this_MetaCrysl_0= ruleMetaCrysl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDomainmodelAccess().getMetaCryslParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MetaCrysl_0=ruleMetaCrysl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MetaCrysl_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:88:3: this_Refinement_1= ruleRefinement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDomainmodelAccess().getRefinementParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Refinement_1=ruleRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Refinement_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleRefinement"
    // InternalCryptSL.g:100:1: entryRuleRefinement returns [EObject current=null] : iv_ruleRefinement= ruleRefinement EOF ;
    public final EObject entryRuleRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinement = null;


        try {
            // InternalCryptSL.g:100:51: (iv_ruleRefinement= ruleRefinement EOF )
            // InternalCryptSL.g:101:2: iv_ruleRefinement= ruleRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefinementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefinement=ruleRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefinement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefinement"


    // $ANTLR start "ruleRefinement"
    // InternalCryptSL.g:107:1: ruleRefinement returns [EObject current=null] : (otherlv_0= 'SPEC' ( (lv_refinementId_1_0= RULE_ID ) ) otherlv_2= 'REFINES' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleOperations ) ) otherlv_6= '}' ) ;
    public final EObject ruleRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_refinementId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_operations_5_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:113:2: ( (otherlv_0= 'SPEC' ( (lv_refinementId_1_0= RULE_ID ) ) otherlv_2= 'REFINES' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleOperations ) ) otherlv_6= '}' ) )
            // InternalCryptSL.g:114:2: (otherlv_0= 'SPEC' ( (lv_refinementId_1_0= RULE_ID ) ) otherlv_2= 'REFINES' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleOperations ) ) otherlv_6= '}' )
            {
            // InternalCryptSL.g:114:2: (otherlv_0= 'SPEC' ( (lv_refinementId_1_0= RULE_ID ) ) otherlv_2= 'REFINES' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleOperations ) ) otherlv_6= '}' )
            // InternalCryptSL.g:115:3: otherlv_0= 'SPEC' ( (lv_refinementId_1_0= RULE_ID ) ) otherlv_2= 'REFINES' ( ( ruleQualifiedName ) ) otherlv_4= '{' ( (lv_operations_5_0= ruleOperations ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRefinementAccess().getSPECKeyword_0());
              		
            }
            // InternalCryptSL.g:119:3: ( (lv_refinementId_1_0= RULE_ID ) )
            // InternalCryptSL.g:120:4: (lv_refinementId_1_0= RULE_ID )
            {
            // InternalCryptSL.g:120:4: (lv_refinementId_1_0= RULE_ID )
            // InternalCryptSL.g:121:5: lv_refinementId_1_0= RULE_ID
            {
            lv_refinementId_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_refinementId_1_0, grammarAccess.getRefinementAccess().getRefinementIdIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRefinementRule());
              					}
              					setWithLastConsumed(
              						current,
              						"refinementId",
              						lv_refinementId_1_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRefinementAccess().getREFINESKeyword_2());
              		
            }
            // InternalCryptSL.g:141:3: ( ( ruleQualifiedName ) )
            // InternalCryptSL.g:142:4: ( ruleQualifiedName )
            {
            // InternalCryptSL.g:142:4: ( ruleQualifiedName )
            // InternalCryptSL.g:143:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRefinementRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRefinementAccess().getJavaTypeJvmTypeCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_5);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRefinementAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalCryptSL.g:161:3: ( (lv_operations_5_0= ruleOperations ) )
            // InternalCryptSL.g:162:4: (lv_operations_5_0= ruleOperations )
            {
            // InternalCryptSL.g:162:4: (lv_operations_5_0= ruleOperations )
            // InternalCryptSL.g:163:5: lv_operations_5_0= ruleOperations
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRefinementAccess().getOperationsOperationsParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_operations_5_0=ruleOperations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRefinementRule());
              					}
              					set(
              						current,
              						"operations",
              						lv_operations_5_0,
              						"de.darmstadt.tu.crossing.CryptSL.Operations");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getRefinementAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefinement"


    // $ANTLR start "entryRuleOperations"
    // InternalCryptSL.g:188:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalCryptSL.g:188:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalCryptSL.g:189:2: iv_ruleOperations= ruleOperations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperations=ruleOperations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperations; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalCryptSL.g:195:1: ruleOperations returns [EObject current=null] : ( ( (lv_operations_0_1= ruleDefinitions | lv_operations_0_2= ruleAddConstraints ) ) )+ ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_1 = null;

        EObject lv_operations_0_2 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:201:2: ( ( ( (lv_operations_0_1= ruleDefinitions | lv_operations_0_2= ruleAddConstraints ) ) )+ )
            // InternalCryptSL.g:202:2: ( ( (lv_operations_0_1= ruleDefinitions | lv_operations_0_2= ruleAddConstraints ) ) )+
            {
            // InternalCryptSL.g:202:2: ( ( (lv_operations_0_1= ruleDefinitions | lv_operations_0_2= ruleAddConstraints ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCryptSL.g:203:3: ( (lv_operations_0_1= ruleDefinitions | lv_operations_0_2= ruleAddConstraints ) )
            	    {
            	    // InternalCryptSL.g:203:3: ( (lv_operations_0_1= ruleDefinitions | lv_operations_0_2= ruleAddConstraints ) )
            	    // InternalCryptSL.g:204:4: (lv_operations_0_1= ruleDefinitions | lv_operations_0_2= ruleAddConstraints )
            	    {
            	    // InternalCryptSL.g:204:4: (lv_operations_0_1= ruleDefinitions | lv_operations_0_2= ruleAddConstraints )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==16) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==19) ) {
            	        alt2=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalCryptSL.g:205:5: lv_operations_0_1= ruleDefinitions
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getOperationsAccess().getOperationsDefinitionsParserRuleCall_0_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_operations_0_1=ruleDefinitions();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getOperationsRule());
            	              					}
            	              					add(
            	              						current,
            	              						"operations",
            	              						lv_operations_0_1,
            	              						"de.darmstadt.tu.crossing.CryptSL.Definitions");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCryptSL.g:221:5: lv_operations_0_2= ruleAddConstraints
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getOperationsAccess().getOperationsAddConstraintsParserRuleCall_0_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_8);
            	            lv_operations_0_2=ruleAddConstraints();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getOperationsRule());
            	              					}
            	              					add(
            	              						current,
            	              						"operations",
            	              						lv_operations_0_2,
            	              						"de.darmstadt.tu.crossing.CryptSL.AddConstraints");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleDefinitions"
    // InternalCryptSL.g:242:1: entryRuleDefinitions returns [EObject current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final EObject entryRuleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitions = null;


        try {
            // InternalCryptSL.g:242:52: (iv_ruleDefinitions= ruleDefinitions EOF )
            // InternalCryptSL.g:243:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinitions=ruleDefinitions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitions"


    // $ANTLR start "ruleDefinitions"
    // InternalCryptSL.g:249:1: ruleDefinitions returns [EObject current=null] : ( (lv_definitions_0_0= ruleDefinition ) ) ;
    public final EObject ruleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:255:2: ( ( (lv_definitions_0_0= ruleDefinition ) ) )
            // InternalCryptSL.g:256:2: ( (lv_definitions_0_0= ruleDefinition ) )
            {
            // InternalCryptSL.g:256:2: ( (lv_definitions_0_0= ruleDefinition ) )
            // InternalCryptSL.g:257:3: (lv_definitions_0_0= ruleDefinition )
            {
            // InternalCryptSL.g:257:3: (lv_definitions_0_0= ruleDefinition )
            // InternalCryptSL.g:258:4: lv_definitions_0_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDefinitionsAccess().getDefinitionsDefinitionParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_definitions_0_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getDefinitionsRule());
              				}
              				add(
              					current,
              					"definitions",
              					lv_definitions_0_0,
              					"de.darmstadt.tu.crossing.CryptSL.Definition");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitions"


    // $ANTLR start "entryRuleDefinition"
    // InternalCryptSL.g:278:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalCryptSL.g:278:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalCryptSL.g:279:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalCryptSL.g:285:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'define' ( (lv_metaVariable_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_algorithms_4_0= ruleLitList ) ) otherlv_5= '}' otherlv_6= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_metaVariable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_algorithms_4_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:291:2: ( (otherlv_0= 'define' ( (lv_metaVariable_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_algorithms_4_0= ruleLitList ) ) otherlv_5= '}' otherlv_6= ';' ) )
            // InternalCryptSL.g:292:2: (otherlv_0= 'define' ( (lv_metaVariable_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_algorithms_4_0= ruleLitList ) ) otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalCryptSL.g:292:2: (otherlv_0= 'define' ( (lv_metaVariable_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_algorithms_4_0= ruleLitList ) ) otherlv_5= '}' otherlv_6= ';' )
            // InternalCryptSL.g:293:3: otherlv_0= 'define' ( (lv_metaVariable_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_algorithms_4_0= ruleLitList ) ) otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefineKeyword_0());
              		
            }
            // InternalCryptSL.g:297:3: ( (lv_metaVariable_1_0= RULE_ID ) )
            // InternalCryptSL.g:298:4: (lv_metaVariable_1_0= RULE_ID )
            {
            // InternalCryptSL.g:298:4: (lv_metaVariable_1_0= RULE_ID )
            // InternalCryptSL.g:299:5: lv_metaVariable_1_0= RULE_ID
            {
            lv_metaVariable_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_metaVariable_1_0, grammarAccess.getDefinitionAccess().getMetaVariableIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"metaVariable",
              						lv_metaVariable_1_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCryptSL.g:323:3: ( (lv_algorithms_4_0= ruleLitList ) )
            // InternalCryptSL.g:324:4: (lv_algorithms_4_0= ruleLitList )
            {
            // InternalCryptSL.g:324:4: (lv_algorithms_4_0= ruleLitList )
            // InternalCryptSL.g:325:5: lv_algorithms_4_0= ruleLitList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getAlgorithmsLitListParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_algorithms_4_0=ruleLitList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"algorithms",
              						lv_algorithms_4_0,
              						"de.darmstadt.tu.crossing.CryptSL.LitList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleAddConstraints"
    // InternalCryptSL.g:354:1: entryRuleAddConstraints returns [EObject current=null] : iv_ruleAddConstraints= ruleAddConstraints EOF ;
    public final EObject entryRuleAddConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddConstraints = null;


        try {
            // InternalCryptSL.g:354:55: (iv_ruleAddConstraints= ruleAddConstraints EOF )
            // InternalCryptSL.g:355:2: iv_ruleAddConstraints= ruleAddConstraints EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddConstraintsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddConstraints=ruleAddConstraints();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddConstraints; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddConstraints"


    // $ANTLR start "ruleAddConstraints"
    // InternalCryptSL.g:361:1: ruleAddConstraints returns [EObject current=null] : ( (lv_addConstraints_0_0= ruleAddConstraint ) ) ;
    public final EObject ruleAddConstraints() throws RecognitionException {
        EObject current = null;

        EObject lv_addConstraints_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:367:2: ( ( (lv_addConstraints_0_0= ruleAddConstraint ) ) )
            // InternalCryptSL.g:368:2: ( (lv_addConstraints_0_0= ruleAddConstraint ) )
            {
            // InternalCryptSL.g:368:2: ( (lv_addConstraints_0_0= ruleAddConstraint ) )
            // InternalCryptSL.g:369:3: (lv_addConstraints_0_0= ruleAddConstraint )
            {
            // InternalCryptSL.g:369:3: (lv_addConstraints_0_0= ruleAddConstraint )
            // InternalCryptSL.g:370:4: lv_addConstraints_0_0= ruleAddConstraint
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAddConstraintsAccess().getAddConstraintsAddConstraintParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_addConstraints_0_0=ruleAddConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAddConstraintsRule());
              				}
              				add(
              					current,
              					"addConstraints",
              					lv_addConstraints_0_0,
              					"de.darmstadt.tu.crossing.CryptSL.AddConstraint");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddConstraints"


    // $ANTLR start "entryRuleAddConstraint"
    // InternalCryptSL.g:390:1: entryRuleAddConstraint returns [EObject current=null] : iv_ruleAddConstraint= ruleAddConstraint EOF ;
    public final EObject entryRuleAddConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddConstraint = null;


        try {
            // InternalCryptSL.g:390:54: (iv_ruleAddConstraint= ruleAddConstraint EOF )
            // InternalCryptSL.g:391:2: iv_ruleAddConstraint= ruleAddConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddConstraint=ruleAddConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddConstraint"


    // $ANTLR start "ruleAddConstraint"
    // InternalCryptSL.g:397:1: ruleAddConstraint returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'constraint' ( (lv_constraint_2_0= ruleConstraint ) ) otherlv_3= ';' ) ;
    public final EObject ruleAddConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_constraint_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:403:2: ( (otherlv_0= 'add' otherlv_1= 'constraint' ( (lv_constraint_2_0= ruleConstraint ) ) otherlv_3= ';' ) )
            // InternalCryptSL.g:404:2: (otherlv_0= 'add' otherlv_1= 'constraint' ( (lv_constraint_2_0= ruleConstraint ) ) otherlv_3= ';' )
            {
            // InternalCryptSL.g:404:2: (otherlv_0= 'add' otherlv_1= 'constraint' ( (lv_constraint_2_0= ruleConstraint ) ) otherlv_3= ';' )
            // InternalCryptSL.g:405:3: otherlv_0= 'add' otherlv_1= 'constraint' ( (lv_constraint_2_0= ruleConstraint ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddConstraintAccess().getAddKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddConstraintAccess().getConstraintKeyword_1());
              		
            }
            // InternalCryptSL.g:413:3: ( (lv_constraint_2_0= ruleConstraint ) )
            // InternalCryptSL.g:414:4: (lv_constraint_2_0= ruleConstraint )
            {
            // InternalCryptSL.g:414:4: (lv_constraint_2_0= ruleConstraint )
            // InternalCryptSL.g:415:5: lv_constraint_2_0= ruleConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddConstraintAccess().getConstraintConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_constraint_2_0=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAddConstraintRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_2_0,
              						"de.darmstadt.tu.crossing.CryptSL.Constraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddConstraintAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddConstraint"


    // $ANTLR start "entryRuleMetaCrysl"
    // InternalCryptSL.g:440:1: entryRuleMetaCrysl returns [EObject current=null] : iv_ruleMetaCrysl= ruleMetaCrysl EOF ;
    public final EObject entryRuleMetaCrysl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaCrysl = null;


        try {
            // InternalCryptSL.g:440:50: (iv_ruleMetaCrysl= ruleMetaCrysl EOF )
            // InternalCryptSL.g:441:2: iv_ruleMetaCrysl= ruleMetaCrysl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaCryslRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetaCrysl=ruleMetaCrysl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaCrysl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaCrysl"


    // $ANTLR start "ruleMetaCrysl"
    // InternalCryptSL.g:447:1: ruleMetaCrysl returns [EObject current=null] : ( (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_3_0= '[]' ) ) | (otherlv_4= '<' ( (lv_genericType_5_0= ruleQualifiedName ) ) otherlv_6= '>' ) )? otherlv_7= 'OBJECTS' ( (lv_usage_8_0= ruleUseBlock ) ) (otherlv_9= 'FORBIDDEN' ( (lv_forbEvent_10_0= ruleForbiddenBlock ) ) )? otherlv_11= 'EVENTS' ( (lv_req_events_12_0= ruleRequiredBlock ) ) otherlv_13= 'ORDER' ( (lv_order_14_0= ruleOrder ) ) (otherlv_15= 'CONSTRAINTS' ( (lv_reqConstraints_16_0= ruleEnforceConsBlock ) ) )? (otherlv_17= 'REQUIRES' ( (lv_require_18_0= ruleRequiresBlock ) ) )? (otherlv_19= 'ENSURES' ( (lv_ensure_20_0= ruleEnsuresBlock ) ) )? (otherlv_21= 'NEGATES' ( (lv_destroy_22_0= ruleDestroysBlock ) ) )? ) ;
    public final EObject ruleMetaCrysl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_array_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_genericType_5_0 = null;

        EObject lv_usage_8_0 = null;

        EObject lv_forbEvent_10_0 = null;

        EObject lv_req_events_12_0 = null;

        EObject lv_order_14_0 = null;

        EObject lv_reqConstraints_16_0 = null;

        EObject lv_require_18_0 = null;

        EObject lv_ensure_20_0 = null;

        EObject lv_destroy_22_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:453:2: ( ( (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_3_0= '[]' ) ) | (otherlv_4= '<' ( (lv_genericType_5_0= ruleQualifiedName ) ) otherlv_6= '>' ) )? otherlv_7= 'OBJECTS' ( (lv_usage_8_0= ruleUseBlock ) ) (otherlv_9= 'FORBIDDEN' ( (lv_forbEvent_10_0= ruleForbiddenBlock ) ) )? otherlv_11= 'EVENTS' ( (lv_req_events_12_0= ruleRequiredBlock ) ) otherlv_13= 'ORDER' ( (lv_order_14_0= ruleOrder ) ) (otherlv_15= 'CONSTRAINTS' ( (lv_reqConstraints_16_0= ruleEnforceConsBlock ) ) )? (otherlv_17= 'REQUIRES' ( (lv_require_18_0= ruleRequiresBlock ) ) )? (otherlv_19= 'ENSURES' ( (lv_ensure_20_0= ruleEnsuresBlock ) ) )? (otherlv_21= 'NEGATES' ( (lv_destroy_22_0= ruleDestroysBlock ) ) )? ) )
            // InternalCryptSL.g:454:2: ( (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_3_0= '[]' ) ) | (otherlv_4= '<' ( (lv_genericType_5_0= ruleQualifiedName ) ) otherlv_6= '>' ) )? otherlv_7= 'OBJECTS' ( (lv_usage_8_0= ruleUseBlock ) ) (otherlv_9= 'FORBIDDEN' ( (lv_forbEvent_10_0= ruleForbiddenBlock ) ) )? otherlv_11= 'EVENTS' ( (lv_req_events_12_0= ruleRequiredBlock ) ) otherlv_13= 'ORDER' ( (lv_order_14_0= ruleOrder ) ) (otherlv_15= 'CONSTRAINTS' ( (lv_reqConstraints_16_0= ruleEnforceConsBlock ) ) )? (otherlv_17= 'REQUIRES' ( (lv_require_18_0= ruleRequiresBlock ) ) )? (otherlv_19= 'ENSURES' ( (lv_ensure_20_0= ruleEnsuresBlock ) ) )? (otherlv_21= 'NEGATES' ( (lv_destroy_22_0= ruleDestroysBlock ) ) )? )
            {
            // InternalCryptSL.g:454:2: ( (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_3_0= '[]' ) ) | (otherlv_4= '<' ( (lv_genericType_5_0= ruleQualifiedName ) ) otherlv_6= '>' ) )? otherlv_7= 'OBJECTS' ( (lv_usage_8_0= ruleUseBlock ) ) (otherlv_9= 'FORBIDDEN' ( (lv_forbEvent_10_0= ruleForbiddenBlock ) ) )? otherlv_11= 'EVENTS' ( (lv_req_events_12_0= ruleRequiredBlock ) ) otherlv_13= 'ORDER' ( (lv_order_14_0= ruleOrder ) ) (otherlv_15= 'CONSTRAINTS' ( (lv_reqConstraints_16_0= ruleEnforceConsBlock ) ) )? (otherlv_17= 'REQUIRES' ( (lv_require_18_0= ruleRequiresBlock ) ) )? (otherlv_19= 'ENSURES' ( (lv_ensure_20_0= ruleEnsuresBlock ) ) )? (otherlv_21= 'NEGATES' ( (lv_destroy_22_0= ruleDestroysBlock ) ) )? )
            // InternalCryptSL.g:455:3: (otherlv_0= 'ABSTRACT' )? otherlv_1= 'SPEC' ( ( ruleQualifiedName ) ) ( ( (lv_array_3_0= '[]' ) ) | (otherlv_4= '<' ( (lv_genericType_5_0= ruleQualifiedName ) ) otherlv_6= '>' ) )? otherlv_7= 'OBJECTS' ( (lv_usage_8_0= ruleUseBlock ) ) (otherlv_9= 'FORBIDDEN' ( (lv_forbEvent_10_0= ruleForbiddenBlock ) ) )? otherlv_11= 'EVENTS' ( (lv_req_events_12_0= ruleRequiredBlock ) ) otherlv_13= 'ORDER' ( (lv_order_14_0= ruleOrder ) ) (otherlv_15= 'CONSTRAINTS' ( (lv_reqConstraints_16_0= ruleEnforceConsBlock ) ) )? (otherlv_17= 'REQUIRES' ( (lv_require_18_0= ruleRequiresBlock ) ) )? (otherlv_19= 'ENSURES' ( (lv_ensure_20_0= ruleEnsuresBlock ) ) )? (otherlv_21= 'NEGATES' ( (lv_destroy_22_0= ruleDestroysBlock ) ) )?
            {
            // InternalCryptSL.g:455:3: (otherlv_0= 'ABSTRACT' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCryptSL.g:456:4: otherlv_0= 'ABSTRACT'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getMetaCryslAccess().getABSTRACTKeyword_0());
                      			
                    }

                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMetaCryslAccess().getSPECKeyword_1());
              		
            }
            // InternalCryptSL.g:465:3: ( ( ruleQualifiedName ) )
            // InternalCryptSL.g:466:4: ( ruleQualifiedName )
            {
            // InternalCryptSL.g:466:4: ( ruleQualifiedName )
            // InternalCryptSL.g:467:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMetaCryslRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetaCryslAccess().getJavaTypeJvmTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:481:3: ( ( (lv_array_3_0= '[]' ) ) | (otherlv_4= '<' ( (lv_genericType_5_0= ruleQualifiedName ) ) otherlv_6= '>' ) )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalCryptSL.g:482:4: ( (lv_array_3_0= '[]' ) )
                    {
                    // InternalCryptSL.g:482:4: ( (lv_array_3_0= '[]' ) )
                    // InternalCryptSL.g:483:5: (lv_array_3_0= '[]' )
                    {
                    // InternalCryptSL.g:483:5: (lv_array_3_0= '[]' )
                    // InternalCryptSL.g:484:6: lv_array_3_0= '[]'
                    {
                    lv_array_3_0=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_array_3_0, grammarAccess.getMetaCryslAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMetaCryslRule());
                      						}
                      						setWithLastConsumed(current, "array", lv_array_3_0, "[]");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:497:4: (otherlv_4= '<' ( (lv_genericType_5_0= ruleQualifiedName ) ) otherlv_6= '>' )
                    {
                    // InternalCryptSL.g:497:4: (otherlv_4= '<' ( (lv_genericType_5_0= ruleQualifiedName ) ) otherlv_6= '>' )
                    // InternalCryptSL.g:498:5: otherlv_4= '<' ( (lv_genericType_5_0= ruleQualifiedName ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getMetaCryslAccess().getLessThanSignKeyword_3_1_0());
                      				
                    }
                    // InternalCryptSL.g:502:5: ( (lv_genericType_5_0= ruleQualifiedName ) )
                    // InternalCryptSL.g:503:6: (lv_genericType_5_0= ruleQualifiedName )
                    {
                    // InternalCryptSL.g:503:6: (lv_genericType_5_0= ruleQualifiedName )
                    // InternalCryptSL.g:504:7: lv_genericType_5_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMetaCryslAccess().getGenericTypeQualifiedNameParserRuleCall_3_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
                    lv_genericType_5_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getMetaCryslRule());
                      							}
                      							set(
                      								current,
                      								"genericType",
                      								lv_genericType_5_0,
                      								"org.eclipse.xtext.xbase.Xtype.QualifiedName");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getMetaCryslAccess().getGreaterThanSignKeyword_3_1_2());
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMetaCryslAccess().getOBJECTSKeyword_4());
              		
            }
            // InternalCryptSL.g:531:3: ( (lv_usage_8_0= ruleUseBlock ) )
            // InternalCryptSL.g:532:4: (lv_usage_8_0= ruleUseBlock )
            {
            // InternalCryptSL.g:532:4: (lv_usage_8_0= ruleUseBlock )
            // InternalCryptSL.g:533:5: lv_usage_8_0= ruleUseBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetaCryslAccess().getUsageUseBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_usage_8_0=ruleUseBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetaCryslRule());
              					}
              					set(
              						current,
              						"usage",
              						lv_usage_8_0,
              						"de.darmstadt.tu.crossing.CryptSL.UseBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:550:3: (otherlv_9= 'FORBIDDEN' ( (lv_forbEvent_10_0= ruleForbiddenBlock ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCryptSL.g:551:4: otherlv_9= 'FORBIDDEN' ( (lv_forbEvent_10_0= ruleForbiddenBlock ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMetaCryslAccess().getFORBIDDENKeyword_6_0());
                      			
                    }
                    // InternalCryptSL.g:555:4: ( (lv_forbEvent_10_0= ruleForbiddenBlock ) )
                    // InternalCryptSL.g:556:5: (lv_forbEvent_10_0= ruleForbiddenBlock )
                    {
                    // InternalCryptSL.g:556:5: (lv_forbEvent_10_0= ruleForbiddenBlock )
                    // InternalCryptSL.g:557:6: lv_forbEvent_10_0= ruleForbiddenBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMetaCryslAccess().getForbEventForbiddenBlockParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_forbEvent_10_0=ruleForbiddenBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMetaCryslRule());
                      						}
                      						set(
                      							current,
                      							"forbEvent",
                      							lv_forbEvent_10_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ForbiddenBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,27,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getMetaCryslAccess().getEVENTSKeyword_7());
              		
            }
            // InternalCryptSL.g:579:3: ( (lv_req_events_12_0= ruleRequiredBlock ) )
            // InternalCryptSL.g:580:4: (lv_req_events_12_0= ruleRequiredBlock )
            {
            // InternalCryptSL.g:580:4: (lv_req_events_12_0= ruleRequiredBlock )
            // InternalCryptSL.g:581:5: lv_req_events_12_0= ruleRequiredBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetaCryslAccess().getReq_eventsRequiredBlockParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_req_events_12_0=ruleRequiredBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetaCryslRule());
              					}
              					set(
              						current,
              						"req_events",
              						lv_req_events_12_0,
              						"de.darmstadt.tu.crossing.CryptSL.RequiredBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,28,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getMetaCryslAccess().getORDERKeyword_9());
              		
            }
            // InternalCryptSL.g:602:3: ( (lv_order_14_0= ruleOrder ) )
            // InternalCryptSL.g:603:4: (lv_order_14_0= ruleOrder )
            {
            // InternalCryptSL.g:603:4: (lv_order_14_0= ruleOrder )
            // InternalCryptSL.g:604:5: lv_order_14_0= ruleOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetaCryslAccess().getOrderOrderParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_order_14_0=ruleOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetaCryslRule());
              					}
              					set(
              						current,
              						"order",
              						lv_order_14_0,
              						"de.darmstadt.tu.crossing.CryptSL.Order");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:621:3: (otherlv_15= 'CONSTRAINTS' ( (lv_reqConstraints_16_0= ruleEnforceConsBlock ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCryptSL.g:622:4: otherlv_15= 'CONSTRAINTS' ( (lv_reqConstraints_16_0= ruleEnforceConsBlock ) )
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getMetaCryslAccess().getCONSTRAINTSKeyword_11_0());
                      			
                    }
                    // InternalCryptSL.g:626:4: ( (lv_reqConstraints_16_0= ruleEnforceConsBlock ) )
                    // InternalCryptSL.g:627:5: (lv_reqConstraints_16_0= ruleEnforceConsBlock )
                    {
                    // InternalCryptSL.g:627:5: (lv_reqConstraints_16_0= ruleEnforceConsBlock )
                    // InternalCryptSL.g:628:6: lv_reqConstraints_16_0= ruleEnforceConsBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMetaCryslAccess().getReqConstraintsEnforceConsBlockParserRuleCall_11_1_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_reqConstraints_16_0=ruleEnforceConsBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMetaCryslRule());
                      						}
                      						set(
                      							current,
                      							"reqConstraints",
                      							lv_reqConstraints_16_0,
                      							"de.darmstadt.tu.crossing.CryptSL.EnforceConsBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCryptSL.g:646:3: (otherlv_17= 'REQUIRES' ( (lv_require_18_0= ruleRequiresBlock ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCryptSL.g:647:4: otherlv_17= 'REQUIRES' ( (lv_require_18_0= ruleRequiresBlock ) )
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getMetaCryslAccess().getREQUIRESKeyword_12_0());
                      			
                    }
                    // InternalCryptSL.g:651:4: ( (lv_require_18_0= ruleRequiresBlock ) )
                    // InternalCryptSL.g:652:5: (lv_require_18_0= ruleRequiresBlock )
                    {
                    // InternalCryptSL.g:652:5: (lv_require_18_0= ruleRequiresBlock )
                    // InternalCryptSL.g:653:6: lv_require_18_0= ruleRequiresBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMetaCryslAccess().getRequireRequiresBlockParserRuleCall_12_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_require_18_0=ruleRequiresBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMetaCryslRule());
                      						}
                      						set(
                      							current,
                      							"require",
                      							lv_require_18_0,
                      							"de.darmstadt.tu.crossing.CryptSL.RequiresBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCryptSL.g:671:3: (otherlv_19= 'ENSURES' ( (lv_ensure_20_0= ruleEnsuresBlock ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCryptSL.g:672:4: otherlv_19= 'ENSURES' ( (lv_ensure_20_0= ruleEnsuresBlock ) )
                    {
                    otherlv_19=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getMetaCryslAccess().getENSURESKeyword_13_0());
                      			
                    }
                    // InternalCryptSL.g:676:4: ( (lv_ensure_20_0= ruleEnsuresBlock ) )
                    // InternalCryptSL.g:677:5: (lv_ensure_20_0= ruleEnsuresBlock )
                    {
                    // InternalCryptSL.g:677:5: (lv_ensure_20_0= ruleEnsuresBlock )
                    // InternalCryptSL.g:678:6: lv_ensure_20_0= ruleEnsuresBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMetaCryslAccess().getEnsureEnsuresBlockParserRuleCall_13_1_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_ensure_20_0=ruleEnsuresBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMetaCryslRule());
                      						}
                      						set(
                      							current,
                      							"ensure",
                      							lv_ensure_20_0,
                      							"de.darmstadt.tu.crossing.CryptSL.EnsuresBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCryptSL.g:696:3: (otherlv_21= 'NEGATES' ( (lv_destroy_22_0= ruleDestroysBlock ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCryptSL.g:697:4: otherlv_21= 'NEGATES' ( (lv_destroy_22_0= ruleDestroysBlock ) )
                    {
                    otherlv_21=(Token)match(input,32,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getMetaCryslAccess().getNEGATESKeyword_14_0());
                      			
                    }
                    // InternalCryptSL.g:701:4: ( (lv_destroy_22_0= ruleDestroysBlock ) )
                    // InternalCryptSL.g:702:5: (lv_destroy_22_0= ruleDestroysBlock )
                    {
                    // InternalCryptSL.g:702:5: (lv_destroy_22_0= ruleDestroysBlock )
                    // InternalCryptSL.g:703:6: lv_destroy_22_0= ruleDestroysBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMetaCryslAccess().getDestroyDestroysBlockParserRuleCall_14_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_destroy_22_0=ruleDestroysBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMetaCryslRule());
                      						}
                      						set(
                      							current,
                      							"destroy",
                      							lv_destroy_22_0,
                      							"de.darmstadt.tu.crossing.CryptSL.DestroysBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetaCrysl"


    // $ANTLR start "entryRuleUseBlock"
    // InternalCryptSL.g:725:1: entryRuleUseBlock returns [EObject current=null] : iv_ruleUseBlock= ruleUseBlock EOF ;
    public final EObject entryRuleUseBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseBlock = null;


        try {
            // InternalCryptSL.g:725:49: (iv_ruleUseBlock= ruleUseBlock EOF )
            // InternalCryptSL.g:726:2: iv_ruleUseBlock= ruleUseBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUseBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUseBlock=ruleUseBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUseBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseBlock"


    // $ANTLR start "ruleUseBlock"
    // InternalCryptSL.g:732:1: ruleUseBlock returns [EObject current=null] : ( (lv_objects_0_0= ruleObjectDecl ) )+ ;
    public final EObject ruleUseBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_objects_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:738:2: ( ( (lv_objects_0_0= ruleObjectDecl ) )+ )
            // InternalCryptSL.g:739:2: ( (lv_objects_0_0= ruleObjectDecl ) )+
            {
            // InternalCryptSL.g:739:2: ( (lv_objects_0_0= ruleObjectDecl ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCryptSL.g:740:3: (lv_objects_0_0= ruleObjectDecl )
            	    {
            	    // InternalCryptSL.g:740:3: (lv_objects_0_0= ruleObjectDecl )
            	    // InternalCryptSL.g:741:4: lv_objects_0_0= ruleObjectDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getUseBlockAccess().getObjectsObjectDeclParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_objects_0_0=ruleObjectDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getUseBlockRule());
            	      				}
            	      				add(
            	      					current,
            	      					"objects",
            	      					lv_objects_0_0,
            	      					"de.darmstadt.tu.crossing.CryptSL.ObjectDecl");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseBlock"


    // $ANTLR start "entryRuleForbiddenBlock"
    // InternalCryptSL.g:761:1: entryRuleForbiddenBlock returns [EObject current=null] : iv_ruleForbiddenBlock= ruleForbiddenBlock EOF ;
    public final EObject entryRuleForbiddenBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbiddenBlock = null;


        try {
            // InternalCryptSL.g:761:55: (iv_ruleForbiddenBlock= ruleForbiddenBlock EOF )
            // InternalCryptSL.g:762:2: iv_ruleForbiddenBlock= ruleForbiddenBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForbiddenBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForbiddenBlock=ruleForbiddenBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForbiddenBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForbiddenBlock"


    // $ANTLR start "ruleForbiddenBlock"
    // InternalCryptSL.g:768:1: ruleForbiddenBlock returns [EObject current=null] : ( (lv_forb_methods_0_0= ruleForbMethod ) )+ ;
    public final EObject ruleForbiddenBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_forb_methods_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:774:2: ( ( (lv_forb_methods_0_0= ruleForbMethod ) )+ )
            // InternalCryptSL.g:775:2: ( (lv_forb_methods_0_0= ruleForbMethod ) )+
            {
            // InternalCryptSL.g:775:2: ( (lv_forb_methods_0_0= ruleForbMethod ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCryptSL.g:776:3: (lv_forb_methods_0_0= ruleForbMethod )
            	    {
            	    // InternalCryptSL.g:776:3: (lv_forb_methods_0_0= ruleForbMethod )
            	    // InternalCryptSL.g:777:4: lv_forb_methods_0_0= ruleForbMethod
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getForbiddenBlockAccess().getForb_methodsForbMethodParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_forb_methods_0_0=ruleForbMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getForbiddenBlockRule());
            	      				}
            	      				add(
            	      					current,
            	      					"forb_methods",
            	      					lv_forb_methods_0_0,
            	      					"de.darmstadt.tu.crossing.CryptSL.ForbMethod");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForbiddenBlock"


    // $ANTLR start "entryRuleRequiredBlock"
    // InternalCryptSL.g:797:1: entryRuleRequiredBlock returns [EObject current=null] : iv_ruleRequiredBlock= ruleRequiredBlock EOF ;
    public final EObject entryRuleRequiredBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredBlock = null;


        try {
            // InternalCryptSL.g:797:54: (iv_ruleRequiredBlock= ruleRequiredBlock EOF )
            // InternalCryptSL.g:798:2: iv_ruleRequiredBlock= ruleRequiredBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiredBlock=ruleRequiredBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredBlock"


    // $ANTLR start "ruleRequiredBlock"
    // InternalCryptSL.g:804:1: ruleRequiredBlock returns [EObject current=null] : ( (lv_req_event_0_0= ruleEvent ) )+ ;
    public final EObject ruleRequiredBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_req_event_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:810:2: ( ( (lv_req_event_0_0= ruleEvent ) )+ )
            // InternalCryptSL.g:811:2: ( (lv_req_event_0_0= ruleEvent ) )+
            {
            // InternalCryptSL.g:811:2: ( (lv_req_event_0_0= ruleEvent ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCryptSL.g:812:3: (lv_req_event_0_0= ruleEvent )
            	    {
            	    // InternalCryptSL.g:812:3: (lv_req_event_0_0= ruleEvent )
            	    // InternalCryptSL.g:813:4: lv_req_event_0_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getRequiredBlockAccess().getReq_eventEventParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_req_event_0_0=ruleEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getRequiredBlockRule());
            	      				}
            	      				add(
            	      					current,
            	      					"req_event",
            	      					lv_req_event_0_0,
            	      					"de.darmstadt.tu.crossing.CryptSL.Event");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredBlock"


    // $ANTLR start "entryRuleEnforceConsBlock"
    // InternalCryptSL.g:833:1: entryRuleEnforceConsBlock returns [EObject current=null] : iv_ruleEnforceConsBlock= ruleEnforceConsBlock EOF ;
    public final EObject entryRuleEnforceConsBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnforceConsBlock = null;


        try {
            // InternalCryptSL.g:833:57: (iv_ruleEnforceConsBlock= ruleEnforceConsBlock EOF )
            // InternalCryptSL.g:834:2: iv_ruleEnforceConsBlock= ruleEnforceConsBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnforceConsBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnforceConsBlock=ruleEnforceConsBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnforceConsBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnforceConsBlock"


    // $ANTLR start "ruleEnforceConsBlock"
    // InternalCryptSL.g:840:1: ruleEnforceConsBlock returns [EObject current=null] : ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+ ;
    public final EObject ruleEnforceConsBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_req_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:846:2: ( ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+ )
            // InternalCryptSL.g:847:2: ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+
            {
            // InternalCryptSL.g:847:2: ( ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==37||LA14_0==53||(LA14_0>=56 && LA14_0<=60)||(LA14_0>=62 && LA14_0<=64)||(LA14_0>=68 && LA14_0<=72)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCryptSL.g:848:3: ( (lv_req_0_0= ruleConstraint ) ) otherlv_1= ';'
            	    {
            	    // InternalCryptSL.g:848:3: ( (lv_req_0_0= ruleConstraint ) )
            	    // InternalCryptSL.g:849:4: (lv_req_0_0= ruleConstraint )
            	    {
            	    // InternalCryptSL.g:849:4: (lv_req_0_0= ruleConstraint )
            	    // InternalCryptSL.g:850:5: lv_req_0_0= ruleConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnforceConsBlockAccess().getReqConstraintParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_req_0_0=ruleConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnforceConsBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"req",
            	      						lv_req_0_0,
            	      						"de.darmstadt.tu.crossing.CryptSL.Constraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,18,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_1, grammarAccess.getEnforceConsBlockAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnforceConsBlock"


    // $ANTLR start "entryRuleRequiresBlock"
    // InternalCryptSL.g:875:1: entryRuleRequiresBlock returns [EObject current=null] : iv_ruleRequiresBlock= ruleRequiresBlock EOF ;
    public final EObject entryRuleRequiresBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiresBlock = null;


        try {
            // InternalCryptSL.g:875:54: (iv_ruleRequiresBlock= ruleRequiresBlock EOF )
            // InternalCryptSL.g:876:2: iv_ruleRequiresBlock= ruleRequiresBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiresBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiresBlock=ruleRequiresBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiresBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiresBlock"


    // $ANTLR start "ruleRequiresBlock"
    // InternalCryptSL.g:882:1: ruleRequiresBlock returns [EObject current=null] : ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+ ;
    public final EObject ruleRequiresBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:888:2: ( ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+ )
            // InternalCryptSL.g:889:2: ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+
            {
            // InternalCryptSL.g:889:2: ( ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||LA15_0==37||LA15_0==53||(LA15_0>=56 && LA15_0<=60)||(LA15_0>=62 && LA15_0<=64)||(LA15_0>=68 && LA15_0<=72)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCryptSL.g:890:3: ( (lv_pred_0_0= ruleReqPred ) ) otherlv_1= ';'
            	    {
            	    // InternalCryptSL.g:890:3: ( (lv_pred_0_0= ruleReqPred ) )
            	    // InternalCryptSL.g:891:4: (lv_pred_0_0= ruleReqPred )
            	    {
            	    // InternalCryptSL.g:891:4: (lv_pred_0_0= ruleReqPred )
            	    // InternalCryptSL.g:892:5: lv_pred_0_0= ruleReqPred
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRequiresBlockAccess().getPredReqPredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_pred_0_0=ruleReqPred();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getRequiresBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"pred",
            	      						lv_pred_0_0,
            	      						"de.darmstadt.tu.crossing.CryptSL.ReqPred");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,18,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_1, grammarAccess.getRequiresBlockAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiresBlock"


    // $ANTLR start "entryRuleEnsuresBlock"
    // InternalCryptSL.g:917:1: entryRuleEnsuresBlock returns [EObject current=null] : iv_ruleEnsuresBlock= ruleEnsuresBlock EOF ;
    public final EObject entryRuleEnsuresBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsuresBlock = null;


        try {
            // InternalCryptSL.g:917:53: (iv_ruleEnsuresBlock= ruleEnsuresBlock EOF )
            // InternalCryptSL.g:918:2: iv_ruleEnsuresBlock= ruleEnsuresBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnsuresBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnsuresBlock=ruleEnsuresBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnsuresBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnsuresBlock"


    // $ANTLR start "ruleEnsuresBlock"
    // InternalCryptSL.g:924:1: ruleEnsuresBlock returns [EObject current=null] : ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ ;
    public final EObject ruleEnsuresBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:930:2: ( ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ )
            // InternalCryptSL.g:931:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            {
            // InternalCryptSL.g:931:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==37||LA16_0==53||(LA16_0>=56 && LA16_0<=60)||(LA16_0>=62 && LA16_0<=64)||(LA16_0>=68 && LA16_0<=72)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCryptSL.g:932:3: ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';'
            	    {
            	    // InternalCryptSL.g:932:3: ( (lv_pred_0_0= ruleEnsPred ) )
            	    // InternalCryptSL.g:933:4: (lv_pred_0_0= ruleEnsPred )
            	    {
            	    // InternalCryptSL.g:933:4: (lv_pred_0_0= ruleEnsPred )
            	    // InternalCryptSL.g:934:5: lv_pred_0_0= ruleEnsPred
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnsuresBlockAccess().getPredEnsPredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_pred_0_0=ruleEnsPred();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnsuresBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"pred",
            	      						lv_pred_0_0,
            	      						"de.darmstadt.tu.crossing.CryptSL.EnsPred");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,18,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_1, grammarAccess.getEnsuresBlockAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnsuresBlock"


    // $ANTLR start "entryRuleDestroysBlock"
    // InternalCryptSL.g:959:1: entryRuleDestroysBlock returns [EObject current=null] : iv_ruleDestroysBlock= ruleDestroysBlock EOF ;
    public final EObject entryRuleDestroysBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestroysBlock = null;


        try {
            // InternalCryptSL.g:959:54: (iv_ruleDestroysBlock= ruleDestroysBlock EOF )
            // InternalCryptSL.g:960:2: iv_ruleDestroysBlock= ruleDestroysBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDestroysBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDestroysBlock=ruleDestroysBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDestroysBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestroysBlock"


    // $ANTLR start "ruleDestroysBlock"
    // InternalCryptSL.g:966:1: ruleDestroysBlock returns [EObject current=null] : ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ ;
    public final EObject ruleDestroysBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:972:2: ( ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+ )
            // InternalCryptSL.g:973:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            {
            // InternalCryptSL.g:973:2: ( ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==37||LA17_0==53||(LA17_0>=56 && LA17_0<=60)||(LA17_0>=62 && LA17_0<=64)||(LA17_0>=68 && LA17_0<=72)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCryptSL.g:974:3: ( (lv_pred_0_0= ruleEnsPred ) ) otherlv_1= ';'
            	    {
            	    // InternalCryptSL.g:974:3: ( (lv_pred_0_0= ruleEnsPred ) )
            	    // InternalCryptSL.g:975:4: (lv_pred_0_0= ruleEnsPred )
            	    {
            	    // InternalCryptSL.g:975:4: (lv_pred_0_0= ruleEnsPred )
            	    // InternalCryptSL.g:976:5: lv_pred_0_0= ruleEnsPred
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDestroysBlockAccess().getPredEnsPredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_pred_0_0=ruleEnsPred();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDestroysBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"pred",
            	      						lv_pred_0_0,
            	      						"de.darmstadt.tu.crossing.CryptSL.EnsPred");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,18,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(otherlv_1, grammarAccess.getDestroysBlockAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestroysBlock"


    // $ANTLR start "entryRuleObjectDecl"
    // InternalCryptSL.g:1001:1: entryRuleObjectDecl returns [EObject current=null] : iv_ruleObjectDecl= ruleObjectDecl EOF ;
    public final EObject entryRuleObjectDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDecl = null;


        try {
            // InternalCryptSL.g:1001:51: (iv_ruleObjectDecl= ruleObjectDecl EOF )
            // InternalCryptSL.g:1002:2: iv_ruleObjectDecl= ruleObjectDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectDecl=ruleObjectDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectDecl"


    // $ANTLR start "ruleObjectDecl"
    // InternalCryptSL.g:1008:1: ruleObjectDecl returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) | otherlv_7= '*' ) ;
    public final EObject ruleObjectDecl() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_collection_3_0 = null;

        EObject lv_objectName_5_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1014:2: ( ( ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) | otherlv_7= '*' ) )
            // InternalCryptSL.g:1015:2: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) | otherlv_7= '*' )
            {
            // InternalCryptSL.g:1015:2: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' ) | otherlv_7= '*' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==33) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCryptSL.g:1016:3: ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' )
                    {
                    // InternalCryptSL.g:1016:3: ( ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';' )
                    // InternalCryptSL.g:1017:4: ( ( ruleQualifiedName ) ) ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )? ( (lv_objectName_5_0= ruleObject ) ) otherlv_6= ';'
                    {
                    // InternalCryptSL.g:1017:4: ( ( ruleQualifiedName ) )
                    // InternalCryptSL.g:1018:5: ( ruleQualifiedName )
                    {
                    // InternalCryptSL.g:1018:5: ( ruleQualifiedName )
                    // InternalCryptSL.g:1019:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getObjectDeclRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getObjectDeclAccess().getObjectTypeJvmTypeCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:1033:4: ( ( (lv_array_1_0= '[]' ) ) | (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' ) )?
                    int alt18=3;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==22) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==23) ) {
                        alt18=2;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalCryptSL.g:1034:5: ( (lv_array_1_0= '[]' ) )
                            {
                            // InternalCryptSL.g:1034:5: ( (lv_array_1_0= '[]' ) )
                            // InternalCryptSL.g:1035:6: (lv_array_1_0= '[]' )
                            {
                            // InternalCryptSL.g:1035:6: (lv_array_1_0= '[]' )
                            // InternalCryptSL.g:1036:7: lv_array_1_0= '[]'
                            {
                            lv_array_1_0=(Token)match(input,22,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_array_1_0, grammarAccess.getObjectDeclAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getObjectDeclRule());
                              							}
                              							setWithLastConsumed(current, "array", lv_array_1_0, "[]");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCryptSL.g:1049:5: (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' )
                            {
                            // InternalCryptSL.g:1049:5: (otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>' )
                            // InternalCryptSL.g:1050:6: otherlv_2= '<' ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) ) otherlv_4= '>'
                            {
                            otherlv_2=(Token)match(input,23,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getObjectDeclAccess().getLessThanSignKeyword_0_1_1_0());
                              					
                            }
                            // InternalCryptSL.g:1054:6: ( (lv_collection_3_0= ruleJvmParameterizedTypeRef ) )
                            // InternalCryptSL.g:1055:7: (lv_collection_3_0= ruleJvmParameterizedTypeRef )
                            {
                            // InternalCryptSL.g:1055:7: (lv_collection_3_0= ruleJvmParameterizedTypeRef )
                            // InternalCryptSL.g:1056:8: lv_collection_3_0= ruleJvmParameterizedTypeRef
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getObjectDeclAccess().getCollectionJvmParameterizedTypeRefParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_17);
                            lv_collection_3_0=ruleJvmParameterizedTypeRef();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getObjectDeclRule());
                              								}
                              								set(
                              									current,
                              									"collection",
                              									lv_collection_3_0,
                              									"de.darmstadt.tu.crossing.CryptSL.JvmParameterizedTypeRef");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getObjectDeclAccess().getGreaterThanSignKeyword_0_1_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalCryptSL.g:1079:4: ( (lv_objectName_5_0= ruleObject ) )
                    // InternalCryptSL.g:1080:5: (lv_objectName_5_0= ruleObject )
                    {
                    // InternalCryptSL.g:1080:5: (lv_objectName_5_0= ruleObject )
                    // InternalCryptSL.g:1081:6: lv_objectName_5_0= ruleObject
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getObjectDeclAccess().getObjectNameObjectParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_objectName_5_0=ruleObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getObjectDeclRule());
                      						}
                      						set(
                      							current,
                      							"objectName",
                      							lv_objectName_5_0,
                      							"de.darmstadt.tu.crossing.CryptSL.Object");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getObjectDeclAccess().getSemicolonKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:1104:3: otherlv_7= '*'
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_7, grammarAccess.getObjectDeclAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectDecl"


    // $ANTLR start "entryRuleJvmParameterizedTypeRef"
    // InternalCryptSL.g:1112:1: entryRuleJvmParameterizedTypeRef returns [EObject current=null] : iv_ruleJvmParameterizedTypeRef= ruleJvmParameterizedTypeRef EOF ;
    public final EObject entryRuleJvmParameterizedTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeRef = null;


        try {
            // InternalCryptSL.g:1112:64: (iv_ruleJvmParameterizedTypeRef= ruleJvmParameterizedTypeRef EOF )
            // InternalCryptSL.g:1113:2: iv_ruleJvmParameterizedTypeRef= ruleJvmParameterizedTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmParameterizedTypeRef=ruleJvmParameterizedTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeRef"


    // $ANTLR start "ruleJvmParameterizedTypeRef"
    // InternalCryptSL.g:1119:1: ruleJvmParameterizedTypeRef returns [EObject current=null] : ( ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )? )* ;
    public final EObject ruleJvmParameterizedTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_arguments_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1125:2: ( ( ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )? )* )
            // InternalCryptSL.g:1126:2: ( ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )? )*
            {
            // InternalCryptSL.g:1126:2: ( ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )? )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=35 && LA23_0<=37)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCryptSL.g:1127:3: ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) ) (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )* (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )?
            	    {
            	    // InternalCryptSL.g:1127:3: ( (lv_arguments_0_0= ruleJvmArgumentTypeRef ) )
            	    // InternalCryptSL.g:1128:4: (lv_arguments_0_0= ruleJvmArgumentTypeRef )
            	    {
            	    // InternalCryptSL.g:1128:4: (lv_arguments_0_0= ruleJvmArgumentTypeRef )
            	    // InternalCryptSL.g:1129:5: lv_arguments_0_0= ruleJvmArgumentTypeRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getJvmParameterizedTypeRefAccess().getArgumentsJvmArgumentTypeRefParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_arguments_0_0=ruleJvmArgumentTypeRef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeRefRule());
            	      					}
            	      					add(
            	      						current,
            	      						"arguments",
            	      						lv_arguments_0_0,
            	      						"de.darmstadt.tu.crossing.CryptSL.JvmArgumentTypeRef");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:1146:3: (otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==34) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalCryptSL.g:1147:4: otherlv_1= ',' ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) )
            	    	    {
            	    	    otherlv_1=(Token)match(input,34,FOLLOW_33); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      				newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeRefAccess().getCommaKeyword_1_0());
            	    	      			
            	    	    }
            	    	    // InternalCryptSL.g:1151:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeRef ) )
            	    	    // InternalCryptSL.g:1152:5: (lv_arguments_2_0= ruleJvmArgumentTypeRef )
            	    	    {
            	    	    // InternalCryptSL.g:1152:5: (lv_arguments_2_0= ruleJvmArgumentTypeRef )
            	    	    // InternalCryptSL.g:1153:6: lv_arguments_2_0= ruleJvmArgumentTypeRef
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getJvmParameterizedTypeRefAccess().getArgumentsJvmArgumentTypeRefParserRuleCall_1_1_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FOLLOW_32);
            	    	    lv_arguments_2_0=ruleJvmArgumentTypeRef();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeRefRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"arguments",
            	    	      							lv_arguments_2_0,
            	    	      							"de.darmstadt.tu.crossing.CryptSL.JvmArgumentTypeRef");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);

            	    // InternalCryptSL.g:1171:3: (otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==23) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalCryptSL.g:1172:4: otherlv_3= '<' ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )* otherlv_7= '>'
            	            {
            	            otherlv_3=(Token)match(input,23,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeRefAccess().getLessThanSignKeyword_2_0());
            	              			
            	            }
            	            // InternalCryptSL.g:1176:4: ( (lv_arguments_4_0= ruleJvmArgumentTypeRef ) )
            	            // InternalCryptSL.g:1177:5: (lv_arguments_4_0= ruleJvmArgumentTypeRef )
            	            {
            	            // InternalCryptSL.g:1177:5: (lv_arguments_4_0= ruleJvmArgumentTypeRef )
            	            // InternalCryptSL.g:1178:6: lv_arguments_4_0= ruleJvmArgumentTypeRef
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getJvmParameterizedTypeRefAccess().getArgumentsJvmArgumentTypeRefParserRuleCall_2_1_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_34);
            	            lv_arguments_4_0=ruleJvmArgumentTypeRef();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeRefRule());
            	              						}
            	              						add(
            	              							current,
            	              							"arguments",
            	              							lv_arguments_4_0,
            	              							"de.darmstadt.tu.crossing.CryptSL.JvmArgumentTypeRef");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }


            	            }

            	            // InternalCryptSL.g:1195:4: (otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) ) )*
            	            loop21:
            	            do {
            	                int alt21=2;
            	                int LA21_0 = input.LA(1);

            	                if ( (LA21_0==34) ) {
            	                    alt21=1;
            	                }


            	                switch (alt21) {
            	            	case 1 :
            	            	    // InternalCryptSL.g:1196:5: otherlv_5= ',' ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) )
            	            	    {
            	            	    otherlv_5=(Token)match(input,34,FOLLOW_33); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      					newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeRefAccess().getCommaKeyword_2_2_0());
            	            	      				
            	            	    }
            	            	    // InternalCryptSL.g:1200:5: ( (lv_arguments_6_0= ruleJvmArgumentTypeRef ) )
            	            	    // InternalCryptSL.g:1201:6: (lv_arguments_6_0= ruleJvmArgumentTypeRef )
            	            	    {
            	            	    // InternalCryptSL.g:1201:6: (lv_arguments_6_0= ruleJvmArgumentTypeRef )
            	            	    // InternalCryptSL.g:1202:7: lv_arguments_6_0= ruleJvmArgumentTypeRef
            	            	    {
            	            	    if ( state.backtracking==0 ) {

            	            	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeRefAccess().getArgumentsJvmArgumentTypeRefParserRuleCall_2_2_1_0());
            	            	      						
            	            	    }
            	            	    pushFollow(FOLLOW_34);
            	            	    lv_arguments_6_0=ruleJvmArgumentTypeRef();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      							if (current==null) {
            	            	      								current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeRefRule());
            	            	      							}
            	            	      							add(
            	            	      								current,
            	            	      								"arguments",
            	            	      								lv_arguments_6_0,
            	            	      								"de.darmstadt.tu.crossing.CryptSL.JvmArgumentTypeRef");
            	            	      							afterParserOrEnumRuleCall();
            	            	      						
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop21;
            	                }
            	            } while (true);

            	            otherlv_7=(Token)match(input,24,FOLLOW_35); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              				newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeRefAccess().getGreaterThanSignKeyword_2_3());
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeRef"


    // $ANTLR start "entryRuleJvmArgumentTypeRef"
    // InternalCryptSL.g:1229:1: entryRuleJvmArgumentTypeRef returns [EObject current=null] : iv_ruleJvmArgumentTypeRef= ruleJvmArgumentTypeRef EOF ;
    public final EObject entryRuleJvmArgumentTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeRef = null;


        try {
            // InternalCryptSL.g:1229:59: (iv_ruleJvmArgumentTypeRef= ruleJvmArgumentTypeRef EOF )
            // InternalCryptSL.g:1230:2: iv_ruleJvmArgumentTypeRef= ruleJvmArgumentTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmArgumentTypeRef=ruleJvmArgumentTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeRef"


    // $ANTLR start "ruleJvmArgumentTypeRef"
    // InternalCryptSL.g:1236:1: ruleJvmArgumentTypeRef returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_type_1_0= ruleJvmWildcardTypeRef ) ) ) ;
    public final EObject ruleJvmArgumentTypeRef() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1242:2: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_type_1_0= ruleJvmWildcardTypeRef ) ) ) )
            // InternalCryptSL.g:1243:2: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_type_1_0= ruleJvmWildcardTypeRef ) ) )
            {
            // InternalCryptSL.g:1243:2: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) | ( (lv_type_1_0= ruleJvmWildcardTypeRef ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=36 && LA24_0<=37)) ) {
                alt24=1;
            }
            else if ( (LA24_0==35) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCryptSL.g:1244:3: ( (lv_type_0_0= ruleJvmTypeReference ) )
                    {
                    // InternalCryptSL.g:1244:3: ( (lv_type_0_0= ruleJvmTypeReference ) )
                    // InternalCryptSL.g:1245:4: (lv_type_0_0= ruleJvmTypeReference )
                    {
                    // InternalCryptSL.g:1245:4: (lv_type_0_0= ruleJvmTypeReference )
                    // InternalCryptSL.g:1246:5: lv_type_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getJvmArgumentTypeRefAccess().getTypeJvmTypeReferenceParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getJvmArgumentTypeRefRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_0_0,
                      						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:1264:3: ( (lv_type_1_0= ruleJvmWildcardTypeRef ) )
                    {
                    // InternalCryptSL.g:1264:3: ( (lv_type_1_0= ruleJvmWildcardTypeRef ) )
                    // InternalCryptSL.g:1265:4: (lv_type_1_0= ruleJvmWildcardTypeRef )
                    {
                    // InternalCryptSL.g:1265:4: (lv_type_1_0= ruleJvmWildcardTypeRef )
                    // InternalCryptSL.g:1266:5: lv_type_1_0= ruleJvmWildcardTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getJvmArgumentTypeRefAccess().getTypeJvmWildcardTypeRefParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleJvmWildcardTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getJvmArgumentTypeRefRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_1_0,
                      						"de.darmstadt.tu.crossing.CryptSL.JvmWildcardTypeRef");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeRef"


    // $ANTLR start "entryRuleJvmWildcardTypeRef"
    // InternalCryptSL.g:1287:1: entryRuleJvmWildcardTypeRef returns [EObject current=null] : iv_ruleJvmWildcardTypeRef= ruleJvmWildcardTypeRef EOF ;
    public final EObject entryRuleJvmWildcardTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeRef = null;


        try {
            // InternalCryptSL.g:1287:59: (iv_ruleJvmWildcardTypeRef= ruleJvmWildcardTypeRef EOF )
            // InternalCryptSL.g:1288:2: iv_ruleJvmWildcardTypeRef= ruleJvmWildcardTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmWildcardTypeRef=ruleJvmWildcardTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeRef"


    // $ANTLR start "ruleJvmWildcardTypeRef"
    // InternalCryptSL.g:1294:1: ruleJvmWildcardTypeRef returns [EObject current=null] : ( () otherlv_1= '?' ) ;
    public final EObject ruleJvmWildcardTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1300:2: ( ( () otherlv_1= '?' ) )
            // InternalCryptSL.g:1301:2: ( () otherlv_1= '?' )
            {
            // InternalCryptSL.g:1301:2: ( () otherlv_1= '?' )
            // InternalCryptSL.g:1302:3: () otherlv_1= '?'
            {
            // InternalCryptSL.g:1302:3: ()
            // InternalCryptSL.g:1303:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJvmWildcardTypeRefAccess().getJvmWildcardTypeReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeRefAccess().getQuestionMarkKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeRef"


    // $ANTLR start "entryRuleForbMethod"
    // InternalCryptSL.g:1317:1: entryRuleForbMethod returns [EObject current=null] : iv_ruleForbMethod= ruleForbMethod EOF ;
    public final EObject entryRuleForbMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbMethod = null;


        try {
            // InternalCryptSL.g:1317:51: (iv_ruleForbMethod= ruleForbMethod EOF )
            // InternalCryptSL.g:1318:2: iv_ruleForbMethod= ruleForbMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForbMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForbMethod=ruleForbMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForbMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForbMethod"


    // $ANTLR start "ruleForbMethod"
    // InternalCryptSL.g:1324:1: ruleForbMethod returns [EObject current=null] : ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' ) ;
    public final EObject ruleForbMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1330:2: ( ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' ) )
            // InternalCryptSL.g:1331:2: ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' )
            {
            // InternalCryptSL.g:1331:2: ( ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';' )
            // InternalCryptSL.g:1332:3: ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? ) otherlv_3= ';'
            {
            // InternalCryptSL.g:1332:3: ( ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalCryptSL.g:1333:4: ( ( ruleFQN ) ) (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalCryptSL.g:1333:4: ( ( ruleFQN ) )
            // InternalCryptSL.g:1334:5: ( ruleFQN )
            {
            // InternalCryptSL.g:1334:5: ( ruleFQN )
            // InternalCryptSL.g:1335:6: ruleFQN
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getForbMethodRule());
              						}
              					
            }
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getForbMethodAccess().getJavaMethJvmExecutableCrossReference_0_0_0());
              					
            }
            pushFollow(FOLLOW_36);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalCryptSL.g:1349:4: (otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCryptSL.g:1350:5: otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getForbMethodAccess().getEqualsSignGreaterThanSignKeyword_0_1_0());
                      				
                    }
                    // InternalCryptSL.g:1354:5: ( (otherlv_2= RULE_ID ) )
                    // InternalCryptSL.g:1355:6: (otherlv_2= RULE_ID )
                    {
                    // InternalCryptSL.g:1355:6: (otherlv_2= RULE_ID )
                    // InternalCryptSL.g:1356:7: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getForbMethodRule());
                      							}
                      						
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_2, grammarAccess.getForbMethodAccess().getRepEventCrossReference_0_1_1_0());
                      						
                    }

                    }


                    }


                    }
                    break;

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForbMethodAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForbMethod"


    // $ANTLR start "entryRuleFQN"
    // InternalCryptSL.g:1377:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCryptSL.g:1377:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCryptSL.g:1378:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCryptSL.g:1384:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QN_0 = null;

        AntlrDatatypeRuleToken this_QN_2 = null;

        AntlrDatatypeRuleToken this_QN_4 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1390:2: ( (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' ) )
            // InternalCryptSL.g:1391:2: (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' )
            {
            // InternalCryptSL.g:1391:2: (this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')' )
            // InternalCryptSL.g:1392:3: this_QN_0= ruleQN kw= '(' (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )? kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_QN_0=ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QN_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,37,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFQNAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalCryptSL.g:1407:3: (this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCryptSL.g:1408:4: this_QN_2= ruleQN (kw= ',' this_QN_4= ruleQN )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_39);
                    this_QN_2=ruleQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_QN_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCryptSL.g:1418:4: (kw= ',' this_QN_4= ruleQN )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==34) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalCryptSL.g:1419:5: kw= ',' this_QN_4= ruleQN
                    	    {
                    	    kw=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getFQNAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getFQNAccess().getQNParserRuleCall_2_1_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    this_QN_4=ruleQN();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_QN_4);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFQNAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleQN"
    // InternalCryptSL.g:1445:1: entryRuleQN returns [String current=null] : iv_ruleQN= ruleQN EOF ;
    public final String entryRuleQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQN = null;


        try {
            // InternalCryptSL.g:1445:42: (iv_ruleQN= ruleQN EOF )
            // InternalCryptSL.g:1446:2: iv_ruleQN= ruleQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQN=ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQN"


    // $ANTLR start "ruleQN"
    // InternalCryptSL.g:1452:1: ruleQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? ) ;
    public final AntlrDatatypeRuleToken ruleQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1458:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? ) )
            // InternalCryptSL.g:1459:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? )
            {
            // InternalCryptSL.g:1459:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )? )
            // InternalCryptSL.g:1460:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '[]' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCryptSL.g:1467:3: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCryptSL.g:1468:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalCryptSL.g:1481:3: (kw= '[]' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCryptSL.g:1482:4: kw= '[]'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQNAccess().getLeftSquareBracketRightSquareBracketKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQN"


    // $ANTLR start "entryRuleEvent"
    // InternalCryptSL.g:1492:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalCryptSL.g:1492:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalCryptSL.g:1493:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalCryptSL.g:1499:1: ruleEvent returns [EObject current=null] : (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate | otherlv_2= '*' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LabelMethodCall_0 = null;

        EObject this_Aggregate_1 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1505:2: ( (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate | otherlv_2= '*' ) )
            // InternalCryptSL.g:1506:2: (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate | otherlv_2= '*' )
            {
            // InternalCryptSL.g:1506:2: (this_LabelMethodCall_0= ruleLabelMethodCall | this_Aggregate_1= ruleAggregate | otherlv_2= '*' )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==40) ) {
                    alt30=1;
                }
                else if ( (LA30_1==43) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA30_0==33) ) {
                alt30=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalCryptSL.g:1507:3: this_LabelMethodCall_0= ruleLabelMethodCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEventAccess().getLabelMethodCallParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LabelMethodCall_0=ruleLabelMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LabelMethodCall_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:1516:3: this_Aggregate_1= ruleAggregate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEventAccess().getAggregateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Aggregate_1=ruleAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Aggregate_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:1525:3: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getAsteriskKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleLabelMethodCall"
    // InternalCryptSL.g:1533:1: entryRuleLabelMethodCall returns [EObject current=null] : iv_ruleLabelMethodCall= ruleLabelMethodCall EOF ;
    public final EObject entryRuleLabelMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelMethodCall = null;


        try {
            // InternalCryptSL.g:1533:56: (iv_ruleLabelMethodCall= ruleLabelMethodCall EOF )
            // InternalCryptSL.g:1534:2: iv_ruleLabelMethodCall= ruleLabelMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLabelMethodCall=ruleLabelMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelMethodCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelMethodCall"


    // $ANTLR start "ruleLabelMethodCall"
    // InternalCryptSL.g:1540:1: ruleLabelMethodCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) ) ;
    public final EObject ruleLabelMethodCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_meth_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1546:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) ) )
            // InternalCryptSL.g:1547:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) )
            {
            // InternalCryptSL.g:1547:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) ) )
            // InternalCryptSL.g:1548:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_meth_2_0= ruleMethod ) )
            {
            // InternalCryptSL.g:1548:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCryptSL.g:1549:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCryptSL.g:1549:4: (lv_name_0_0= RULE_ID )
            // InternalCryptSL.g:1550:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getLabelMethodCallAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLabelMethodCallRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLabelMethodCallAccess().getColonKeyword_1());
              		
            }
            // InternalCryptSL.g:1570:3: ( (lv_meth_2_0= ruleMethod ) )
            // InternalCryptSL.g:1571:4: (lv_meth_2_0= ruleMethod )
            {
            // InternalCryptSL.g:1571:4: (lv_meth_2_0= ruleMethod )
            // InternalCryptSL.g:1572:5: lv_meth_2_0= ruleMethod
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLabelMethodCallAccess().getMethMethodParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_meth_2_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLabelMethodCallRule());
              					}
              					set(
              						current,
              						"meth",
              						lv_meth_2_0,
              						"de.darmstadt.tu.crossing.CryptSL.Method");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelMethodCall"


    // $ANTLR start "entryRuleMethod"
    // InternalCryptSL.g:1593:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalCryptSL.g:1593:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalCryptSL.g:1594:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalCryptSL.g:1600:1: ruleMethod returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parList_4_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1606:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' ) )
            // InternalCryptSL.g:1607:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' )
            {
            // InternalCryptSL.g:1607:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');' )
            // InternalCryptSL.g:1608:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_parList_4_0= ruleParList ) )? otherlv_5= ');'
            {
            // InternalCryptSL.g:1608:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==17) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalCryptSL.g:1609:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // InternalCryptSL.g:1609:4: ( (otherlv_0= RULE_ID ) )
                    // InternalCryptSL.g:1610:5: (otherlv_0= RULE_ID )
                    {
                    // InternalCryptSL.g:1610:5: (otherlv_0= RULE_ID )
                    // InternalCryptSL.g:1611:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMethodRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getLeftSideObjectCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getEqualsSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCryptSL.g:1627:3: ( (otherlv_2= RULE_ID ) )
            // InternalCryptSL.g:1628:4: (otherlv_2= RULE_ID )
            {
            // InternalCryptSL.g:1628:4: (otherlv_2= RULE_ID )
            // InternalCryptSL.g:1629:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getMethNameJvmExecutableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalCryptSL.g:1644:3: ( (lv_parList_4_0= ruleParList ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCryptSL.g:1645:4: (lv_parList_4_0= ruleParList )
                    {
                    // InternalCryptSL.g:1645:4: (lv_parList_4_0= ruleParList )
                    // InternalCryptSL.g:1646:5: lv_parList_4_0= ruleParList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodAccess().getParListParListParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_43);
                    lv_parList_4_0=ruleParList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMethodRule());
                      					}
                      					set(
                      						current,
                      						"parList",
                      						lv_parList_4_0,
                      						"de.darmstadt.tu.crossing.CryptSL.ParList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParList"
    // InternalCryptSL.g:1671:1: entryRuleParList returns [EObject current=null] : iv_ruleParList= ruleParList EOF ;
    public final EObject entryRuleParList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParList = null;


        try {
            // InternalCryptSL.g:1671:48: (iv_ruleParList= ruleParList EOF )
            // InternalCryptSL.g:1672:2: iv_ruleParList= ruleParList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParList=ruleParList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParList"


    // $ANTLR start "ruleParList"
    // InternalCryptSL.g:1678:1: ruleParList returns [EObject current=null] : ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* ) ;
    public final EObject ruleParList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1684:2: ( ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* ) )
            // InternalCryptSL.g:1685:2: ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* )
            {
            // InternalCryptSL.g:1685:2: ( ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )* )
            // InternalCryptSL.g:1686:3: ( (lv_parameters_0_0= rulePar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )*
            {
            // InternalCryptSL.g:1686:3: ( (lv_parameters_0_0= rulePar ) )
            // InternalCryptSL.g:1687:4: (lv_parameters_0_0= rulePar )
            {
            // InternalCryptSL.g:1687:4: (lv_parameters_0_0= rulePar )
            // InternalCryptSL.g:1688:5: lv_parameters_0_0= rulePar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParListAccess().getParametersParParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_parameters_0_0=rulePar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParListRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_0_0,
              						"de.darmstadt.tu.crossing.CryptSL.Par");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:1705:3: (otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==34) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCryptSL.g:1706:4: otherlv_1= ',' ( (lv_parameters_2_0= rulePar ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getParListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCryptSL.g:1710:4: ( (lv_parameters_2_0= rulePar ) )
            	    // InternalCryptSL.g:1711:5: (lv_parameters_2_0= rulePar )
            	    {
            	    // InternalCryptSL.g:1711:5: (lv_parameters_2_0= rulePar )
            	    // InternalCryptSL.g:1712:6: lv_parameters_2_0= rulePar
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParListAccess().getParametersParParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_parameters_2_0=rulePar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.Par");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParList"


    // $ANTLR start "entryRulePar"
    // InternalCryptSL.g:1734:1: entryRulePar returns [EObject current=null] : iv_rulePar= rulePar EOF ;
    public final EObject entryRulePar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePar = null;


        try {
            // InternalCryptSL.g:1734:44: (iv_rulePar= rulePar EOF )
            // InternalCryptSL.g:1735:2: iv_rulePar= rulePar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePar=rulePar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePar"


    // $ANTLR start "rulePar"
    // InternalCryptSL.g:1741:1: rulePar returns [EObject current=null] : ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) ) ;
    public final EObject rulePar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1747:2: ( ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) ) )
            // InternalCryptSL.g:1748:2: ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) )
            {
            // InternalCryptSL.g:1748:2: ( () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' ) )
            // InternalCryptSL.g:1749:3: () ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' )
            {
            // InternalCryptSL.g:1749:3: ()
            // InternalCryptSL.g:1750:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParAccess().getParAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:1756:3: ( ( (otherlv_1= RULE_ID ) ) | otherlv_2= '_' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==42) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalCryptSL.g:1757:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalCryptSL.g:1757:4: ( (otherlv_1= RULE_ID ) )
                    // InternalCryptSL.g:1758:5: (otherlv_1= RULE_ID )
                    {
                    // InternalCryptSL.g:1758:5: (otherlv_1= RULE_ID )
                    // InternalCryptSL.g:1759:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getParRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getParAccess().getValObjectCrossReference_1_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:1771:4: otherlv_2= '_'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParAccess().get_Keyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePar"


    // $ANTLR start "entryRuleAggregate"
    // InternalCryptSL.g:1780:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // InternalCryptSL.g:1780:50: (iv_ruleAggregate= ruleAggregate EOF )
            // InternalCryptSL.g:1781:2: iv_ruleAggregate= ruleAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAggregate"


    // $ANTLR start "ruleAggregate"
    // InternalCryptSL.g:1787:1: ruleAggregate returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalCryptSL.g:1793:2: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) ) )
            // InternalCryptSL.g:1794:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) )
            {
            // InternalCryptSL.g:1794:2: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' ) )
            // InternalCryptSL.g:1795:3: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' )
            {
            // InternalCryptSL.g:1795:3: ()
            // InternalCryptSL.g:1796:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAggregateAccess().getAggregateAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:1802:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';' )
            // InternalCryptSL.g:1803:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* ) otherlv_6= ';'
            {
            // InternalCryptSL.g:1803:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalCryptSL.g:1804:5: (lv_name_1_0= RULE_ID )
            {
            // InternalCryptSL.g:1804:5: (lv_name_1_0= RULE_ID )
            // InternalCryptSL.g:1805:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(lv_name_1_0, grammarAccess.getAggregateAccess().getNameIDTerminalRuleCall_1_0_0());
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getAggregateRule());
              						}
              						setWithLastConsumed(
              							current,
              							"name",
              							lv_name_1_0,
              							"org.eclipse.xtext.xbase.Xtype.ID");
              					
            }

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getAggregateAccess().getColonEqualsSignKeyword_1_1());
              			
            }
            // InternalCryptSL.g:1825:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalCryptSL.g:1826:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )*
            {
            // InternalCryptSL.g:1826:5: ( (otherlv_3= RULE_ID ) )
            // InternalCryptSL.g:1827:6: (otherlv_3= RULE_ID )
            {
            // InternalCryptSL.g:1827:6: (otherlv_3= RULE_ID )
            // InternalCryptSL.g:1828:7: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElement(grammarAccess.getAggregateRule());
              							}
              						
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							newLeafNode(otherlv_3, grammarAccess.getAggregateAccess().getLabEventCrossReference_1_2_0_0());
              						
            }

            }


            }

            // InternalCryptSL.g:1839:5: (otherlv_4= '|' ( (otherlv_5= RULE_ID ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==44) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCryptSL.g:1840:6: otherlv_4= '|' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_4, grammarAccess.getAggregateAccess().getVerticalLineKeyword_1_2_1_0());
            	      					
            	    }
            	    // InternalCryptSL.g:1844:6: ( (otherlv_5= RULE_ID ) )
            	    // InternalCryptSL.g:1845:7: (otherlv_5= RULE_ID )
            	    {
            	    // InternalCryptSL.g:1845:7: (otherlv_5= RULE_ID )
            	    // InternalCryptSL.g:1846:8: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElement(grammarAccess.getAggregateRule());
            	      								}
            	      							
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_5, grammarAccess.getAggregateAccess().getLabEventCrossReference_1_2_1_1_0());
            	      							
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getAggregateAccess().getSemicolonKeyword_1_3());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleOrder"
    // InternalCryptSL.g:1868:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalCryptSL.g:1868:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalCryptSL.g:1869:2: iv_ruleOrder= ruleOrder EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrder; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalCryptSL.g:1875:1: ruleOrder returns [EObject current=null] : ( (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) | otherlv_4= '*' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token lv_orderop_2_0=null;
        Token otherlv_4=null;
        EObject this_SimpleOrder_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1881:2: ( ( (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) | otherlv_4= '*' ) )
            // InternalCryptSL.g:1882:2: ( (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) | otherlv_4= '*' )
            {
            // InternalCryptSL.g:1882:2: ( (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* ) | otherlv_4= '*' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==37) ) {
                alt37=1;
            }
            else if ( (LA37_0==33) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalCryptSL.g:1883:3: (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* )
                    {
                    // InternalCryptSL.g:1883:3: (this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )* )
                    // InternalCryptSL.g:1884:4: this_SimpleOrder_0= ruleSimpleOrder ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOrderAccess().getSimpleOrderParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_44);
                    this_SimpleOrder_0=ruleSimpleOrder();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SimpleOrder_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCryptSL.g:1892:4: ( () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==34) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalCryptSL.g:1893:5: () ( (lv_orderop_2_0= ',' ) ) ( (lv_right_3_0= ruleSimpleOrder ) )
                    	    {
                    	    // InternalCryptSL.g:1893:5: ()
                    	    // InternalCryptSL.g:1894:6: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						current = forceCreateModelElementAndSet(
                    	      							grammarAccess.getOrderAccess().getOrderLeftAction_0_1_0(),
                    	      							current);
                    	      					
                    	    }

                    	    }

                    	    // InternalCryptSL.g:1900:5: ( (lv_orderop_2_0= ',' ) )
                    	    // InternalCryptSL.g:1901:6: (lv_orderop_2_0= ',' )
                    	    {
                    	    // InternalCryptSL.g:1901:6: (lv_orderop_2_0= ',' )
                    	    // InternalCryptSL.g:1902:7: lv_orderop_2_0= ','
                    	    {
                    	    lv_orderop_2_0=(Token)match(input,34,FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_orderop_2_0, grammarAccess.getOrderAccess().getOrderopCommaKeyword_0_1_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getOrderRule());
                    	      							}
                    	      							setWithLastConsumed(current, "orderop", lv_orderop_2_0, ",");
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCryptSL.g:1914:5: ( (lv_right_3_0= ruleSimpleOrder ) )
                    	    // InternalCryptSL.g:1915:6: (lv_right_3_0= ruleSimpleOrder )
                    	    {
                    	    // InternalCryptSL.g:1915:6: (lv_right_3_0= ruleSimpleOrder )
                    	    // InternalCryptSL.g:1916:7: lv_right_3_0= ruleSimpleOrder
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrderAccess().getRightSimpleOrderParserRuleCall_0_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_44);
                    	    lv_right_3_0=ruleSimpleOrder();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrderRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"right",
                    	      								lv_right_3_0,
                    	      								"de.darmstadt.tu.crossing.CryptSL.SimpleOrder");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:1936:3: otherlv_4= '*'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleSimpleOrder"
    // InternalCryptSL.g:1944:1: entryRuleSimpleOrder returns [EObject current=null] : iv_ruleSimpleOrder= ruleSimpleOrder EOF ;
    public final EObject entryRuleSimpleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOrder = null;


        try {
            // InternalCryptSL.g:1944:52: (iv_ruleSimpleOrder= ruleSimpleOrder EOF )
            // InternalCryptSL.g:1945:2: iv_ruleSimpleOrder= ruleSimpleOrder EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleOrderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleOrder=ruleSimpleOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleOrder; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleOrder"


    // $ANTLR start "ruleSimpleOrder"
    // InternalCryptSL.g:1951:1: ruleSimpleOrder returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleSimpleOrder() throws RecognitionException {
        EObject current = null;

        Token lv_orderop_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:1957:2: ( (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalCryptSL.g:1958:2: (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalCryptSL.g:1958:2: (this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalCryptSL.g:1959:3: this_Primary_0= rulePrimary ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSimpleOrderAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:1967:3: ( () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==44) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCryptSL.g:1968:4: () ( (lv_orderop_2_0= '|' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalCryptSL.g:1968:4: ()
            	    // InternalCryptSL.g:1969:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSimpleOrderAccess().getSimpleOrderLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:1975:4: ( (lv_orderop_2_0= '|' ) )
            	    // InternalCryptSL.g:1976:5: (lv_orderop_2_0= '|' )
            	    {
            	    // InternalCryptSL.g:1976:5: (lv_orderop_2_0= '|' )
            	    // InternalCryptSL.g:1977:6: lv_orderop_2_0= '|'
            	    {
            	    lv_orderop_2_0=(Token)match(input,44,FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_orderop_2_0, grammarAccess.getSimpleOrderAccess().getOrderopVerticalLineKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSimpleOrderRule());
            	      						}
            	      						setWithLastConsumed(current, "orderop", lv_orderop_2_0, "|");
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:1989:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalCryptSL.g:1990:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalCryptSL.g:1990:5: (lv_right_3_0= rulePrimary )
            	    // InternalCryptSL.g:1991:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSimpleOrderAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSimpleOrderRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleOrder"


    // $ANTLR start "entryRulePrimary"
    // InternalCryptSL.g:2013:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCryptSL.g:2013:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCryptSL.g:2014:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalCryptSL.g:2020:1: rulePrimary returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementop_1_1=null;
        Token lv_elementop_1_2=null;
        Token lv_elementop_1_3=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_elementop_5_1=null;
        Token lv_elementop_5_2=null;
        Token lv_elementop_5_3=null;
        EObject this_Order_3 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2026:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) ) )
            // InternalCryptSL.g:2027:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) )
            {
            // InternalCryptSL.g:2027:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? ) | (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==37) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalCryptSL.g:2028:3: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? )
                    {
                    // InternalCryptSL.g:2028:3: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )? )
                    // InternalCryptSL.g:2029:4: ( (otherlv_0= RULE_ID ) ) ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )?
                    {
                    // InternalCryptSL.g:2029:4: ( (otherlv_0= RULE_ID ) )
                    // InternalCryptSL.g:2030:5: (otherlv_0= RULE_ID )
                    {
                    // InternalCryptSL.g:2030:5: (otherlv_0= RULE_ID )
                    // InternalCryptSL.g:2031:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getOrderEvEventCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:2042:4: ( ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==33||LA40_0==35||LA40_0==45) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalCryptSL.g:2043:5: ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) )
                            {
                            // InternalCryptSL.g:2043:5: ( (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' ) )
                            // InternalCryptSL.g:2044:6: (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' )
                            {
                            // InternalCryptSL.g:2044:6: (lv_elementop_1_1= '+' | lv_elementop_1_2= '?' | lv_elementop_1_3= '*' )
                            int alt39=3;
                            switch ( input.LA(1) ) {
                            case 45:
                                {
                                alt39=1;
                                }
                                break;
                            case 35:
                                {
                                alt39=2;
                                }
                                break;
                            case 33:
                                {
                                alt39=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }

                            switch (alt39) {
                                case 1 :
                                    // InternalCryptSL.g:2045:7: lv_elementop_1_1= '+'
                                    {
                                    lv_elementop_1_1=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_1_1, grammarAccess.getPrimaryAccess().getElementopPlusSignKeyword_0_1_0_0());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_1_1, null);
                                      						
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalCryptSL.g:2056:7: lv_elementop_1_2= '?'
                                    {
                                    lv_elementop_1_2=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_1_2, grammarAccess.getPrimaryAccess().getElementopQuestionMarkKeyword_0_1_0_1());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_1_2, null);
                                      						
                                    }

                                    }
                                    break;
                                case 3 :
                                    // InternalCryptSL.g:2067:7: lv_elementop_1_3= '*'
                                    {
                                    lv_elementop_1_3=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_1_3, grammarAccess.getPrimaryAccess().getElementopAsteriskKeyword_0_1_0_2());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_1_3, null);
                                      						
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2082:3: (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? )
                    {
                    // InternalCryptSL.g:2082:3: (otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )? )
                    // InternalCryptSL.g:2083:4: otherlv_2= '(' this_Order_3= ruleOrder otherlv_4= ')' ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )?
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getOrderParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_51);
                    this_Order_3=ruleOrder();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Order_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,38,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                      			
                    }
                    // InternalCryptSL.g:2099:4: ( ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==33||LA42_0==35||LA42_0==45) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalCryptSL.g:2100:5: ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) )
                            {
                            // InternalCryptSL.g:2100:5: ( (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' ) )
                            // InternalCryptSL.g:2101:6: (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' )
                            {
                            // InternalCryptSL.g:2101:6: (lv_elementop_5_1= '+' | lv_elementop_5_2= '?' | lv_elementop_5_3= '*' )
                            int alt41=3;
                            switch ( input.LA(1) ) {
                            case 45:
                                {
                                alt41=1;
                                }
                                break;
                            case 35:
                                {
                                alt41=2;
                                }
                                break;
                            case 33:
                                {
                                alt41=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 0, input);

                                throw nvae;
                            }

                            switch (alt41) {
                                case 1 :
                                    // InternalCryptSL.g:2102:7: lv_elementop_5_1= '+'
                                    {
                                    lv_elementop_5_1=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_5_1, grammarAccess.getPrimaryAccess().getElementopPlusSignKeyword_1_3_0_0());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_5_1, null);
                                      						
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalCryptSL.g:2113:7: lv_elementop_5_2= '?'
                                    {
                                    lv_elementop_5_2=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_5_2, grammarAccess.getPrimaryAccess().getElementopQuestionMarkKeyword_1_3_0_1());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_5_2, null);
                                      						
                                    }

                                    }
                                    break;
                                case 3 :
                                    // InternalCryptSL.g:2124:7: lv_elementop_5_3= '*'
                                    {
                                    lv_elementop_5_3=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(lv_elementop_5_3, grammarAccess.getPrimaryAccess().getElementopAsteriskKeyword_1_3_0_2());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElement(grammarAccess.getPrimaryRule());
                                      							}
                                      							setWithLastConsumed(current, "elementop", lv_elementop_5_3, null);
                                      						
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleConstraint"
    // InternalCryptSL.g:2142:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalCryptSL.g:2142:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCryptSL.g:2143:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCryptSL.g:2149:1: ruleConstraint returns [EObject current=null] : this_LogicalImplyExpression_0= ruleLogicalImplyExpression ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalImplyExpression_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2155:2: (this_LogicalImplyExpression_0= ruleLogicalImplyExpression )
            // InternalCryptSL.g:2156:2: this_LogicalImplyExpression_0= ruleLogicalImplyExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getConstraintAccess().getLogicalImplyExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_LogicalImplyExpression_0=ruleLogicalImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_LogicalImplyExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleLogicalImplyExpression"
    // InternalCryptSL.g:2167:1: entryRuleLogicalImplyExpression returns [EObject current=null] : iv_ruleLogicalImplyExpression= ruleLogicalImplyExpression EOF ;
    public final EObject entryRuleLogicalImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalImplyExpression = null;


        try {
            // InternalCryptSL.g:2167:63: (iv_ruleLogicalImplyExpression= ruleLogicalImplyExpression EOF )
            // InternalCryptSL.g:2168:2: iv_ruleLogicalImplyExpression= ruleLogicalImplyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalImplyExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalImplyExpression=ruleLogicalImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalImplyExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalImplyExpression"


    // $ANTLR start "ruleLogicalImplyExpression"
    // InternalCryptSL.g:2174:1: ruleLogicalImplyExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* ) ;
    public final EObject ruleLogicalImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2180:2: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* ) )
            // InternalCryptSL.g:2181:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* )
            {
            // InternalCryptSL.g:2181:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )* )
            // InternalCryptSL.g:2182:3: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalImplyExpressionAccess().getLogicalOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:2190:3: ( () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==36) ) {
                    switch ( input.LA(2) ) {
                    case 64:
                        {
                        int LA44_3 = input.LA(3);

                        if ( ((LA44_3>=RULE_STRING && LA44_3<=RULE_INT)||LA44_3==37||LA44_3==53||(LA44_3>=56 && LA44_3<=60)||(LA44_3>=62 && LA44_3<=63)||(LA44_3>=68 && LA44_3<=72)) ) {
                            alt44=1;
                        }
                        else if ( (LA44_3==RULE_ID) ) {
                            int LA44_6 = input.LA(4);

                            if ( (LA44_6==EOF||LA44_6==18||(LA44_6>=23 && LA44_6<=24)||LA44_6==36||(LA44_6>=38 && LA44_6<=39)||(LA44_6>=45 && LA44_6<=51)||(LA44_6>=65 && LA44_6<=67)) ) {
                                alt44=1;
                            }


                        }


                        }
                        break;
                    case RULE_ID:
                        {
                        int LA44_4 = input.LA(3);

                        if ( (LA44_4==EOF||LA44_4==18||(LA44_4>=23 && LA44_4<=24)||LA44_4==33||LA44_4==36||(LA44_4>=38 && LA44_4<=39)||(LA44_4>=45 && LA44_4<=52)||(LA44_4>=65 && LA44_4<=67)) ) {
                            alt44=1;
                        }


                        }
                        break;
                    case RULE_STRING:
                    case RULE_INT:
                    case 37:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 62:
                    case 63:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                        {
                        alt44=1;
                        }
                        break;

                    }

                }


                switch (alt44) {
            	case 1 :
            	    // InternalCryptSL.g:2191:4: () ( (lv_operator_2_0= ruleLogicalImply ) ) ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) )
            	    {
            	    // InternalCryptSL.g:2191:4: ()
            	    // InternalCryptSL.g:2192:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalImplyExpressionAccess().getConstraintLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:2198:4: ( (lv_operator_2_0= ruleLogicalImply ) )
            	    // InternalCryptSL.g:2199:5: (lv_operator_2_0= ruleLogicalImply )
            	    {
            	    // InternalCryptSL.g:2199:5: (lv_operator_2_0= ruleLogicalImply )
            	    // InternalCryptSL.g:2200:6: lv_operator_2_0= ruleLogicalImply
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalImplyExpressionAccess().getOperatorLogicalImplyParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleLogicalImply();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalImplyExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalImply");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:2217:4: ( (lv_rightExpression_3_0= ruleLogicalOrExpression ) )
            	    // InternalCryptSL.g:2218:5: (lv_rightExpression_3_0= ruleLogicalOrExpression )
            	    {
            	    // InternalCryptSL.g:2218:5: (lv_rightExpression_3_0= ruleLogicalOrExpression )
            	    // InternalCryptSL.g:2219:6: lv_rightExpression_3_0= ruleLogicalOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalImplyExpressionAccess().getRightExpressionLogicalOrExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_rightExpression_3_0=ruleLogicalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalImplyExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalOrExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalImplyExpression"


    // $ANTLR start "entryRuleLogicalImply"
    // InternalCryptSL.g:2241:1: entryRuleLogicalImply returns [EObject current=null] : iv_ruleLogicalImply= ruleLogicalImply EOF ;
    public final EObject entryRuleLogicalImply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalImply = null;


        try {
            // InternalCryptSL.g:2241:53: (iv_ruleLogicalImply= ruleLogicalImply EOF )
            // InternalCryptSL.g:2242:2: iv_ruleLogicalImply= ruleLogicalImply EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalImplyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalImply=ruleLogicalImply();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalImply; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalImply"


    // $ANTLR start "ruleLogicalImply"
    // InternalCryptSL.g:2248:1: ruleLogicalImply returns [EObject current=null] : ( (lv_IMPLIES_0_0= '=>' ) ) ;
    public final EObject ruleLogicalImply() throws RecognitionException {
        EObject current = null;

        Token lv_IMPLIES_0_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2254:2: ( ( (lv_IMPLIES_0_0= '=>' ) ) )
            // InternalCryptSL.g:2255:2: ( (lv_IMPLIES_0_0= '=>' ) )
            {
            // InternalCryptSL.g:2255:2: ( (lv_IMPLIES_0_0= '=>' ) )
            // InternalCryptSL.g:2256:3: (lv_IMPLIES_0_0= '=>' )
            {
            // InternalCryptSL.g:2256:3: (lv_IMPLIES_0_0= '=>' )
            // InternalCryptSL.g:2257:4: lv_IMPLIES_0_0= '=>'
            {
            lv_IMPLIES_0_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_IMPLIES_0_0, grammarAccess.getLogicalImplyAccess().getIMPLIESEqualsSignGreaterThanSignKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLogicalImplyRule());
              				}
              				setWithLastConsumed(current, "IMPLIES", lv_IMPLIES_0_0, "=>");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalImply"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalCryptSL.g:2272:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalCryptSL.g:2272:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalCryptSL.g:2273:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalCryptSL.g:2279:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2285:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) )
            // InternalCryptSL.g:2286:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // InternalCryptSL.g:2286:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            // InternalCryptSL.g:2287:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:2295:3: ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==46) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalCryptSL.g:2296:4: () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // InternalCryptSL.g:2296:4: ()
            	    // InternalCryptSL.g:2297:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalOrExpressionAccess().getConstraintLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:2303:4: ( (lv_operator_2_0= ruleLogicalOr ) )
            	    // InternalCryptSL.g:2304:5: (lv_operator_2_0= ruleLogicalOr )
            	    {
            	    // InternalCryptSL.g:2304:5: (lv_operator_2_0= ruleLogicalOr )
            	    // InternalCryptSL.g:2305:6: lv_operator_2_0= ruleLogicalOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleLogicalOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:2322:4: ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    // InternalCryptSL.g:2323:5: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    {
            	    // InternalCryptSL.g:2323:5: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    // InternalCryptSL.g:2324:6: lv_rightExpression_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_rightExpression_3_0=ruleLogicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalOr"
    // InternalCryptSL.g:2346:1: entryRuleLogicalOr returns [EObject current=null] : iv_ruleLogicalOr= ruleLogicalOr EOF ;
    public final EObject entryRuleLogicalOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOr = null;


        try {
            // InternalCryptSL.g:2346:50: (iv_ruleLogicalOr= ruleLogicalOr EOF )
            // InternalCryptSL.g:2347:2: iv_ruleLogicalOr= ruleLogicalOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOr=ruleLogicalOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOr"


    // $ANTLR start "ruleLogicalOr"
    // InternalCryptSL.g:2353:1: ruleLogicalOr returns [EObject current=null] : ( (lv_OR_0_0= '||' ) ) ;
    public final EObject ruleLogicalOr() throws RecognitionException {
        EObject current = null;

        Token lv_OR_0_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2359:2: ( ( (lv_OR_0_0= '||' ) ) )
            // InternalCryptSL.g:2360:2: ( (lv_OR_0_0= '||' ) )
            {
            // InternalCryptSL.g:2360:2: ( (lv_OR_0_0= '||' ) )
            // InternalCryptSL.g:2361:3: (lv_OR_0_0= '||' )
            {
            // InternalCryptSL.g:2361:3: (lv_OR_0_0= '||' )
            // InternalCryptSL.g:2362:4: lv_OR_0_0= '||'
            {
            lv_OR_0_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_OR_0_0, grammarAccess.getLogicalOrAccess().getORVerticalLineVerticalLineKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLogicalOrRule());
              				}
              				setWithLastConsumed(current, "OR", lv_OR_0_0, "||");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOr"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalCryptSL.g:2377:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalCryptSL.g:2377:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalCryptSL.g:2378:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalCryptSL.g:2384:1: ruleLogicalAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2390:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalCryptSL.g:2391:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalCryptSL.g:2391:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // InternalCryptSL.g:2392:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:2400:3: ( () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==47) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalCryptSL.g:2401:4: () ( (lv_operator_2_0= ruleLogicalAnd ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalCryptSL.g:2401:4: ()
            	    // InternalCryptSL.g:2402:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getLogicalAndExpressionAccess().getConstraintLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:2408:4: ( (lv_operator_2_0= ruleLogicalAnd ) )
            	    // InternalCryptSL.g:2409:5: (lv_operator_2_0= ruleLogicalAnd )
            	    {
            	    // InternalCryptSL.g:2409:5: (lv_operator_2_0= ruleLogicalAnd )
            	    // InternalCryptSL.g:2410:6: lv_operator_2_0= ruleLogicalAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalAnd");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:2427:4: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // InternalCryptSL.g:2428:5: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // InternalCryptSL.g:2428:5: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // InternalCryptSL.g:2429:6: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_rightExpression_3_0=ruleComparisonExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.ComparisonExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleLogicalAnd"
    // InternalCryptSL.g:2451:1: entryRuleLogicalAnd returns [EObject current=null] : iv_ruleLogicalAnd= ruleLogicalAnd EOF ;
    public final EObject entryRuleLogicalAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAnd = null;


        try {
            // InternalCryptSL.g:2451:51: (iv_ruleLogicalAnd= ruleLogicalAnd EOF )
            // InternalCryptSL.g:2452:2: iv_ruleLogicalAnd= ruleLogicalAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAnd=ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAnd"


    // $ANTLR start "ruleLogicalAnd"
    // InternalCryptSL.g:2458:1: ruleLogicalAnd returns [EObject current=null] : ( (lv_AND_0_0= '&&' ) ) ;
    public final EObject ruleLogicalAnd() throws RecognitionException {
        EObject current = null;

        Token lv_AND_0_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2464:2: ( ( (lv_AND_0_0= '&&' ) ) )
            // InternalCryptSL.g:2465:2: ( (lv_AND_0_0= '&&' ) )
            {
            // InternalCryptSL.g:2465:2: ( (lv_AND_0_0= '&&' ) )
            // InternalCryptSL.g:2466:3: (lv_AND_0_0= '&&' )
            {
            // InternalCryptSL.g:2466:3: (lv_AND_0_0= '&&' )
            // InternalCryptSL.g:2467:4: lv_AND_0_0= '&&'
            {
            lv_AND_0_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_AND_0_0, grammarAccess.getLogicalAndAccess().getANDAmpersandAmpersandKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLogicalAndRule());
              				}
              				setWithLastConsumed(current, "AND", lv_AND_0_0, "&&");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAnd"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalCryptSL.g:2482:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalCryptSL.g:2482:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalCryptSL.g:2483:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalCryptSL.g:2489:1: ruleComparisonExpression returns [EObject current=null] : (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonHigherOpExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2495:2: ( (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) )
            // InternalCryptSL.g:2496:2: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            {
            // InternalCryptSL.g:2496:2: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            // InternalCryptSL.g:2497:3: this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_ComparisonHigherOpExpression_0=ruleComparisonHigherOpExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonHigherOpExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:2505:3: ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=65 && LA47_0<=66)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCryptSL.g:2506:4: () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    {
                    // InternalCryptSL.g:2506:4: ()
                    // InternalCryptSL.g:2507:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCryptSL.g:2513:4: ( (lv_operator_2_0= ruleComparingEQNEQOperator ) )
                    // InternalCryptSL.g:2514:5: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    {
                    // InternalCryptSL.g:2514:5: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    // InternalCryptSL.g:2515:6: lv_operator_2_0= ruleComparingEQNEQOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_operator_2_0=ruleComparingEQNEQOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ComparingEQNEQOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:2532:4: ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    // InternalCryptSL.g:2533:5: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    {
                    // InternalCryptSL.g:2533:5: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    // InternalCryptSL.g:2534:6: lv_rightExpression_3_0= ruleComparisonHigherOpExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleComparisonHigherOpExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rightExpression",
                      							lv_rightExpression_3_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ComparisonHigherOpExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonHigherOpExpression"
    // InternalCryptSL.g:2556:1: entryRuleComparisonHigherOpExpression returns [EObject current=null] : iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF ;
    public final EObject entryRuleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonHigherOpExpression = null;


        try {
            // InternalCryptSL.g:2556:69: (iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF )
            // InternalCryptSL.g:2557:2: iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonHigherOpExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonHigherOpExpression=ruleComparisonHigherOpExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonHigherOpExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonHigherOpExpression"


    // $ANTLR start "ruleComparisonHigherOpExpression"
    // InternalCryptSL.g:2563:1: ruleComparisonHigherOpExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2569:2: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) )
            // InternalCryptSL.g:2570:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            {
            // InternalCryptSL.g:2570:2: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            // InternalCryptSL.g:2571:3: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArithmeticExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:2579:3: ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=23 && LA48_0<=24)||(LA48_0>=48 && LA48_0<=49)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCryptSL.g:2580:4: () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    {
                    // InternalCryptSL.g:2580:4: ()
                    // InternalCryptSL.g:2581:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCryptSL.g:2587:4: ( (lv_operator_2_0= ruleComparingRelOperator ) )
                    // InternalCryptSL.g:2588:5: (lv_operator_2_0= ruleComparingRelOperator )
                    {
                    // InternalCryptSL.g:2588:5: (lv_operator_2_0= ruleComparingRelOperator )
                    // InternalCryptSL.g:2589:6: lv_operator_2_0= ruleComparingRelOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_operator_2_0=ruleComparingRelOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ComparingRelOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:2606:4: ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    // InternalCryptSL.g:2607:5: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    {
                    // InternalCryptSL.g:2607:5: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    // InternalCryptSL.g:2608:6: lv_rightExpression_3_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightExpression_3_0=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rightExpression",
                      							lv_rightExpression_3_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ArithmeticExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonHigherOpExpression"


    // $ANTLR start "entryRuleComparingRelOperator"
    // InternalCryptSL.g:2630:1: entryRuleComparingRelOperator returns [EObject current=null] : iv_ruleComparingRelOperator= ruleComparingRelOperator EOF ;
    public final EObject entryRuleComparingRelOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparingRelOperator = null;


        try {
            // InternalCryptSL.g:2630:61: (iv_ruleComparingRelOperator= ruleComparingRelOperator EOF )
            // InternalCryptSL.g:2631:2: iv_ruleComparingRelOperator= ruleComparingRelOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparingRelOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparingRelOperator=ruleComparingRelOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparingRelOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparingRelOperator"


    // $ANTLR start "ruleComparingRelOperator"
    // InternalCryptSL.g:2637:1: ruleComparingRelOperator returns [EObject current=null] : ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) ) ;
    public final EObject ruleComparingRelOperator() throws RecognitionException {
        EObject current = null;

        Token lv_LESS_0_0=null;
        Token lv_LESS_OR_EQUAL_1_0=null;
        Token lv_GREATER_OR_EQUAL_2_0=null;
        Token lv_GREATER_3_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2643:2: ( ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) ) )
            // InternalCryptSL.g:2644:2: ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) )
            {
            // InternalCryptSL.g:2644:2: ( ( (lv_LESS_0_0= '<' ) ) | ( (lv_LESS_OR_EQUAL_1_0= '<=' ) ) | ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) ) | ( (lv_GREATER_3_0= '>' ) ) )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt49=1;
                }
                break;
            case 48:
                {
                alt49=2;
                }
                break;
            case 49:
                {
                alt49=3;
                }
                break;
            case 24:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalCryptSL.g:2645:3: ( (lv_LESS_0_0= '<' ) )
                    {
                    // InternalCryptSL.g:2645:3: ( (lv_LESS_0_0= '<' ) )
                    // InternalCryptSL.g:2646:4: (lv_LESS_0_0= '<' )
                    {
                    // InternalCryptSL.g:2646:4: (lv_LESS_0_0= '<' )
                    // InternalCryptSL.g:2647:5: lv_LESS_0_0= '<'
                    {
                    lv_LESS_0_0=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_LESS_0_0, grammarAccess.getComparingRelOperatorAccess().getLESSLessThanSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingRelOperatorRule());
                      					}
                      					setWithLastConsumed(current, "LESS", lv_LESS_0_0, "<");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2660:3: ( (lv_LESS_OR_EQUAL_1_0= '<=' ) )
                    {
                    // InternalCryptSL.g:2660:3: ( (lv_LESS_OR_EQUAL_1_0= '<=' ) )
                    // InternalCryptSL.g:2661:4: (lv_LESS_OR_EQUAL_1_0= '<=' )
                    {
                    // InternalCryptSL.g:2661:4: (lv_LESS_OR_EQUAL_1_0= '<=' )
                    // InternalCryptSL.g:2662:5: lv_LESS_OR_EQUAL_1_0= '<='
                    {
                    lv_LESS_OR_EQUAL_1_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_LESS_OR_EQUAL_1_0, grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALLessThanSignEqualsSignKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingRelOperatorRule());
                      					}
                      					setWithLastConsumed(current, "LESS_OR_EQUAL", lv_LESS_OR_EQUAL_1_0, "<=");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:2675:3: ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) )
                    {
                    // InternalCryptSL.g:2675:3: ( (lv_GREATER_OR_EQUAL_2_0= '>=' ) )
                    // InternalCryptSL.g:2676:4: (lv_GREATER_OR_EQUAL_2_0= '>=' )
                    {
                    // InternalCryptSL.g:2676:4: (lv_GREATER_OR_EQUAL_2_0= '>=' )
                    // InternalCryptSL.g:2677:5: lv_GREATER_OR_EQUAL_2_0= '>='
                    {
                    lv_GREATER_OR_EQUAL_2_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_GREATER_OR_EQUAL_2_0, grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALGreaterThanSignEqualsSignKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingRelOperatorRule());
                      					}
                      					setWithLastConsumed(current, "GREATER_OR_EQUAL", lv_GREATER_OR_EQUAL_2_0, ">=");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCryptSL.g:2690:3: ( (lv_GREATER_3_0= '>' ) )
                    {
                    // InternalCryptSL.g:2690:3: ( (lv_GREATER_3_0= '>' ) )
                    // InternalCryptSL.g:2691:4: (lv_GREATER_3_0= '>' )
                    {
                    // InternalCryptSL.g:2691:4: (lv_GREATER_3_0= '>' )
                    // InternalCryptSL.g:2692:5: lv_GREATER_3_0= '>'
                    {
                    lv_GREATER_3_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_GREATER_3_0, grammarAccess.getComparingRelOperatorAccess().getGREATERGreaterThanSignKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingRelOperatorRule());
                      					}
                      					setWithLastConsumed(current, "GREATER", lv_GREATER_3_0, ">");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparingRelOperator"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalCryptSL.g:2708:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // InternalCryptSL.g:2708:61: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // InternalCryptSL.g:2709:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalCryptSL.g:2715:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2721:2: (this_AdditionExpression_0= ruleAdditionExpression )
            // InternalCryptSL.g:2722:2: this_AdditionExpression_0= ruleAdditionExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_AdditionExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalCryptSL.g:2733:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // InternalCryptSL.g:2733:59: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // InternalCryptSL.g:2734:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // InternalCryptSL.g:2740:1: ruleAdditionExpression returns [EObject current=null] : (this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModularExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2746:2: ( (this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )* ) )
            // InternalCryptSL.g:2747:2: (this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )* )
            {
            // InternalCryptSL.g:2747:2: (this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )* )
            // InternalCryptSL.g:2748:3: this_ModularExpression_0= ruleModularExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionExpressionAccess().getModularExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_ModularExpression_0=ruleModularExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ModularExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:2756:3: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==45||LA50_0==50) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCryptSL.g:2757:4: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleModularExpression ) )
            	    {
            	    // InternalCryptSL.g:2757:4: ()
            	    // InternalCryptSL.g:2758:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:2764:4: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // InternalCryptSL.g:2765:5: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // InternalCryptSL.g:2765:5: (lv_operator_2_0= ruleAdditionOperator )
            	    // InternalCryptSL.g:2766:6: lv_operator_2_0= ruleAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleAdditionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.AdditionOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:2783:4: ( (lv_rightExpression_3_0= ruleModularExpression ) )
            	    // InternalCryptSL.g:2784:5: (lv_rightExpression_3_0= ruleModularExpression )
            	    {
            	    // InternalCryptSL.g:2784:5: (lv_rightExpression_3_0= ruleModularExpression )
            	    // InternalCryptSL.g:2785:6: lv_rightExpression_3_0= ruleModularExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionModularExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_rightExpression_3_0=ruleModularExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.ModularExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleAdditionOperator"
    // InternalCryptSL.g:2807:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // InternalCryptSL.g:2807:57: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // InternalCryptSL.g:2808:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionOperator"


    // $ANTLR start "ruleAdditionOperator"
    // InternalCryptSL.g:2814:1: ruleAdditionOperator returns [EObject current=null] : ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token lv_PLUS_0_0=null;
        Token lv_MINUS_1_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2820:2: ( ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) ) )
            // InternalCryptSL.g:2821:2: ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) )
            {
            // InternalCryptSL.g:2821:2: ( ( (lv_PLUS_0_0= '+' ) ) | ( (lv_MINUS_1_0= '-' ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==45) ) {
                alt51=1;
            }
            else if ( (LA51_0==50) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalCryptSL.g:2822:3: ( (lv_PLUS_0_0= '+' ) )
                    {
                    // InternalCryptSL.g:2822:3: ( (lv_PLUS_0_0= '+' ) )
                    // InternalCryptSL.g:2823:4: (lv_PLUS_0_0= '+' )
                    {
                    // InternalCryptSL.g:2823:4: (lv_PLUS_0_0= '+' )
                    // InternalCryptSL.g:2824:5: lv_PLUS_0_0= '+'
                    {
                    lv_PLUS_0_0=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_PLUS_0_0, grammarAccess.getAdditionOperatorAccess().getPLUSPlusSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAdditionOperatorRule());
                      					}
                      					setWithLastConsumed(current, "PLUS", lv_PLUS_0_0, "+");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2837:3: ( (lv_MINUS_1_0= '-' ) )
                    {
                    // InternalCryptSL.g:2837:3: ( (lv_MINUS_1_0= '-' ) )
                    // InternalCryptSL.g:2838:4: (lv_MINUS_1_0= '-' )
                    {
                    // InternalCryptSL.g:2838:4: (lv_MINUS_1_0= '-' )
                    // InternalCryptSL.g:2839:5: lv_MINUS_1_0= '-'
                    {
                    lv_MINUS_1_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_MINUS_1_0, grammarAccess.getAdditionOperatorAccess().getMINUSHyphenMinusKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAdditionOperatorRule());
                      					}
                      					setWithLastConsumed(current, "MINUS", lv_MINUS_1_0, "-");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "entryRuleModularExpression"
    // InternalCryptSL.g:2855:1: entryRuleModularExpression returns [EObject current=null] : iv_ruleModularExpression= ruleModularExpression EOF ;
    public final EObject entryRuleModularExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModularExpression = null;


        try {
            // InternalCryptSL.g:2855:58: (iv_ruleModularExpression= ruleModularExpression EOF )
            // InternalCryptSL.g:2856:2: iv_ruleModularExpression= ruleModularExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModularExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModularExpression=ruleModularExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModularExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModularExpression"


    // $ANTLR start "ruleModularExpression"
    // InternalCryptSL.g:2862:1: ruleModularExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleModularExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2868:2: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) )
            // InternalCryptSL.g:2869:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // InternalCryptSL.g:2869:2: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            // InternalCryptSL.g:2870:3: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModularExpressionAccess().getMultiplicationExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicationExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:2878:3: ( () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==51) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalCryptSL.g:2879:4: () ( (lv_operator_2_0= ruleModularOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // InternalCryptSL.g:2879:4: ()
            	    // InternalCryptSL.g:2880:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getModularExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:2886:4: ( (lv_operator_2_0= ruleModularOperator ) )
            	    // InternalCryptSL.g:2887:5: (lv_operator_2_0= ruleModularOperator )
            	    {
            	    // InternalCryptSL.g:2887:5: (lv_operator_2_0= ruleModularOperator )
            	    // InternalCryptSL.g:2888:6: lv_operator_2_0= ruleModularOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModularExpressionAccess().getOperatorModularOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleModularOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModularExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.ModularOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:2905:4: ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    // InternalCryptSL.g:2906:5: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    {
            	    // InternalCryptSL.g:2906:5: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    // InternalCryptSL.g:2907:6: lv_rightExpression_3_0= ruleMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModularExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_rightExpression_3_0=ruleMultiplicationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModularExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.MultiplicationExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModularExpression"


    // $ANTLR start "entryRuleModularOperator"
    // InternalCryptSL.g:2929:1: entryRuleModularOperator returns [EObject current=null] : iv_ruleModularOperator= ruleModularOperator EOF ;
    public final EObject entryRuleModularOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModularOperator = null;


        try {
            // InternalCryptSL.g:2929:56: (iv_ruleModularOperator= ruleModularOperator EOF )
            // InternalCryptSL.g:2930:2: iv_ruleModularOperator= ruleModularOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModularOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModularOperator=ruleModularOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModularOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModularOperator"


    // $ANTLR start "ruleModularOperator"
    // InternalCryptSL.g:2936:1: ruleModularOperator returns [EObject current=null] : ( (lv_MOD_0_0= '%' ) ) ;
    public final EObject ruleModularOperator() throws RecognitionException {
        EObject current = null;

        Token lv_MOD_0_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:2942:2: ( ( (lv_MOD_0_0= '%' ) ) )
            // InternalCryptSL.g:2943:2: ( (lv_MOD_0_0= '%' ) )
            {
            // InternalCryptSL.g:2943:2: ( (lv_MOD_0_0= '%' ) )
            // InternalCryptSL.g:2944:3: (lv_MOD_0_0= '%' )
            {
            // InternalCryptSL.g:2944:3: (lv_MOD_0_0= '%' )
            // InternalCryptSL.g:2945:4: lv_MOD_0_0= '%'
            {
            lv_MOD_0_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_MOD_0_0, grammarAccess.getModularOperatorAccess().getMODPercentSignKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getModularOperatorRule());
              				}
              				setWithLastConsumed(current, "MOD", lv_MOD_0_0, "%");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModularOperator"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalCryptSL.g:2960:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // InternalCryptSL.g:2960:65: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // InternalCryptSL.g:2961:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalCryptSL.g:2967:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryPreExpression_0 = null;

        EObject this_Operand_1 = null;

        EObject lv_operator_3_0 = null;

        EObject lv_rightExpression_4_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:2973:2: ( (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) ) )
            // InternalCryptSL.g:2974:2: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) )
            {
            // InternalCryptSL.g:2974:2: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==64) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_INT)||LA54_0==37||LA54_0==53||(LA54_0>=56 && LA54_0<=60)||(LA54_0>=62 && LA54_0<=63)||(LA54_0>=68 && LA54_0<=72)) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalCryptSL.g:2975:3: this_UnaryPreExpression_0= ruleUnaryPreExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryPreExpression_0=ruleUnaryPreExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryPreExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:2984:3: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* )
                    {
                    // InternalCryptSL.g:2984:3: (this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )* )
                    // InternalCryptSL.g:2985:4: this_Operand_1= ruleOperand ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperandParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_59);
                    this_Operand_1=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Operand_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCryptSL.g:2993:4: ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==33||LA53_0==52) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalCryptSL.g:2994:5: () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( (lv_rightExpression_4_0= ruleOperand ) )
                    	    {
                    	    // InternalCryptSL.g:2994:5: ()
                    	    // InternalCryptSL.g:2995:6: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						current = forceCreateModelElementAndSet(
                    	      							grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0(),
                    	      							current);
                    	      					
                    	    }

                    	    }

                    	    // InternalCryptSL.g:3001:5: ( (lv_operator_3_0= ruleMultiplicationOperator ) )
                    	    // InternalCryptSL.g:3002:6: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    {
                    	    // InternalCryptSL.g:3002:6: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    // InternalCryptSL.g:3003:7: lv_operator_3_0= ruleMultiplicationOperator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_operator_3_0=ruleMultiplicationOperator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"operator",
                    	      								lv_operator_3_0,
                    	      								"de.darmstadt.tu.crossing.CryptSL.MultiplicationOperator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCryptSL.g:3020:5: ( (lv_rightExpression_4_0= ruleOperand ) )
                    	    // InternalCryptSL.g:3021:6: (lv_rightExpression_4_0= ruleOperand )
                    	    {
                    	    // InternalCryptSL.g:3021:6: (lv_rightExpression_4_0= ruleOperand )
                    	    // InternalCryptSL.g:3022:7: lv_rightExpression_4_0= ruleOperand
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionOperandParserRuleCall_1_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_59);
                    	    lv_rightExpression_4_0=ruleOperand();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"rightExpression",
                    	      								lv_rightExpression_4_0,
                    	      								"de.darmstadt.tu.crossing.CryptSL.Operand");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleMultiplicationOperator"
    // InternalCryptSL.g:3045:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // InternalCryptSL.g:3045:63: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // InternalCryptSL.g:3046:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // InternalCryptSL.g:3052:1: ruleMultiplicationOperator returns [EObject current=null] : ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token lv_TIMES_0_0=null;
        Token lv_DIVIDE_1_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:3058:2: ( ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) ) )
            // InternalCryptSL.g:3059:2: ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) )
            {
            // InternalCryptSL.g:3059:2: ( ( (lv_TIMES_0_0= '*' ) ) | ( (lv_DIVIDE_1_0= '/' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==33) ) {
                alt55=1;
            }
            else if ( (LA55_0==52) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalCryptSL.g:3060:3: ( (lv_TIMES_0_0= '*' ) )
                    {
                    // InternalCryptSL.g:3060:3: ( (lv_TIMES_0_0= '*' ) )
                    // InternalCryptSL.g:3061:4: (lv_TIMES_0_0= '*' )
                    {
                    // InternalCryptSL.g:3061:4: (lv_TIMES_0_0= '*' )
                    // InternalCryptSL.g:3062:5: lv_TIMES_0_0= '*'
                    {
                    lv_TIMES_0_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_TIMES_0_0, grammarAccess.getMultiplicationOperatorAccess().getTIMESAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicationOperatorRule());
                      					}
                      					setWithLastConsumed(current, "TIMES", lv_TIMES_0_0, "*");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3075:3: ( (lv_DIVIDE_1_0= '/' ) )
                    {
                    // InternalCryptSL.g:3075:3: ( (lv_DIVIDE_1_0= '/' ) )
                    // InternalCryptSL.g:3076:4: (lv_DIVIDE_1_0= '/' )
                    {
                    // InternalCryptSL.g:3076:4: (lv_DIVIDE_1_0= '/' )
                    // InternalCryptSL.g:3077:5: lv_DIVIDE_1_0= '/'
                    {
                    lv_DIVIDE_1_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_DIVIDE_1_0, grammarAccess.getMultiplicationOperatorAccess().getDIVIDESolidusKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicationOperatorRule());
                      					}
                      					setWithLastConsumed(current, "DIVIDE", lv_DIVIDE_1_0, "/");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "entryRuleUnaryPreExpression"
    // InternalCryptSL.g:3093:1: entryRuleUnaryPreExpression returns [EObject current=null] : iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF ;
    public final EObject entryRuleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreExpression = null;


        try {
            // InternalCryptSL.g:3093:59: (iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF )
            // InternalCryptSL.g:3094:2: iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryPreExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryPreExpression=ruleUnaryPreExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryPreExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryPreExpression"


    // $ANTLR start "ruleUnaryPreExpression"
    // InternalCryptSL.g:3100:1: ruleUnaryPreExpression returns [EObject current=null] : ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) ) ;
    public final EObject ruleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_1_0 = null;

        EObject lv_enclosedExpression_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3106:2: ( ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) ) )
            // InternalCryptSL.g:3107:2: ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) )
            {
            // InternalCryptSL.g:3107:2: ( () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) )
            // InternalCryptSL.g:3108:3: () ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            {
            // InternalCryptSL.g:3108:3: ()
            // InternalCryptSL.g:3109:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnaryPreExpressionAccess().getUnaryPreExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:3115:3: ( ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            // InternalCryptSL.g:3116:4: ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) )
            {
            // InternalCryptSL.g:3116:4: ( (lv_operator_1_0= ruleUnaryPreOperator ) )
            // InternalCryptSL.g:3117:5: (lv_operator_1_0= ruleUnaryPreOperator )
            {
            // InternalCryptSL.g:3117:5: (lv_operator_1_0= ruleUnaryPreOperator )
            // InternalCryptSL.g:3118:6: lv_operator_1_0= ruleUnaryPreOperator
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_13);
            lv_operator_1_0=ruleUnaryPreOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
              						}
              						set(
              							current,
              							"operator",
              							lv_operator_1_0,
              							"de.darmstadt.tu.crossing.CryptSL.UnaryPreOperator");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalCryptSL.g:3135:4: ( (lv_enclosedExpression_2_0= ruleOperand ) )
            // InternalCryptSL.g:3136:5: (lv_enclosedExpression_2_0= ruleOperand )
            {
            // InternalCryptSL.g:3136:5: (lv_enclosedExpression_2_0= ruleOperand )
            // InternalCryptSL.g:3137:6: lv_enclosedExpression_2_0= ruleOperand
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionOperandParserRuleCall_1_1_0());
              					
            }
            pushFollow(FOLLOW_2);
            lv_enclosedExpression_2_0=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
              						}
              						set(
              							current,
              							"enclosedExpression",
              							lv_enclosedExpression_2_0,
              							"de.darmstadt.tu.crossing.CryptSL.Operand");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryPreExpression"


    // $ANTLR start "entryRuleOperand"
    // InternalCryptSL.g:3159:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalCryptSL.g:3159:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalCryptSL.g:3160:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalCryptSL.g:3166:1: ruleOperand returns [EObject current=null] : ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Constraint_1 = null;

        EObject this_Cons_3 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3172:2: ( ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons ) )
            // InternalCryptSL.g:3173:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons )
            {
            // InternalCryptSL.g:3173:2: ( (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' ) | this_Cons_3= ruleCons )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==37) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_INT)||LA56_0==53||(LA56_0>=56 && LA56_0<=60)||(LA56_0>=62 && LA56_0<=63)||(LA56_0>=68 && LA56_0<=72)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalCryptSL.g:3174:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    {
                    // InternalCryptSL.g:3174:3: (otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')' )
                    // InternalCryptSL.g:3175:4: otherlv_0= '(' this_Constraint_1= ruleConstraint otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOperandAccess().getConstraintParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_51);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Constraint_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3193:3: this_Cons_3= ruleCons
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getConsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Cons_3=ruleCons();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Cons_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalCryptSL.g:3205:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalCryptSL.g:3205:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalCryptSL.g:3206:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalCryptSL.g:3212:1: ruleLiteralExpression returns [EObject current=null] : ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject this_PreDefinedPredicates_2 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3218:2: ( ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates ) )
            // InternalCryptSL.g:3219:2: ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates )
            {
            // InternalCryptSL.g:3219:2: ( ( (lv_name_0_0= ruleLiteral ) ) | ( (lv_name_1_0= ruleAggregateExpression ) ) | this_PreDefinedPredicates_2= rulePreDefinedPredicates )
            int alt57=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 62:
            case 63:
                {
                alt57=1;
                }
                break;
            case RULE_ID:
                {
                alt57=2;
                }
                break;
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalCryptSL.g:3220:3: ( (lv_name_0_0= ruleLiteral ) )
                    {
                    // InternalCryptSL.g:3220:3: ( (lv_name_0_0= ruleLiteral ) )
                    // InternalCryptSL.g:3221:4: (lv_name_0_0= ruleLiteral )
                    {
                    // InternalCryptSL.g:3221:4: (lv_name_0_0= ruleLiteral )
                    // InternalCryptSL.g:3222:5: lv_name_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNameLiteralParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_name_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_0_0,
                      						"de.darmstadt.tu.crossing.CryptSL.Literal");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3240:3: ( (lv_name_1_0= ruleAggregateExpression ) )
                    {
                    // InternalCryptSL.g:3240:3: ( (lv_name_1_0= ruleAggregateExpression ) )
                    // InternalCryptSL.g:3241:4: (lv_name_1_0= ruleAggregateExpression )
                    {
                    // InternalCryptSL.g:3241:4: (lv_name_1_0= ruleAggregateExpression )
                    // InternalCryptSL.g:3242:5: lv_name_1_0= ruleAggregateExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNameAggregateExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleAggregateExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"de.darmstadt.tu.crossing.CryptSL.AggregateExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:3260:3: this_PreDefinedPredicates_2= rulePreDefinedPredicates
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getPreDefinedPredicatesParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PreDefinedPredicates_2=rulePreDefinedPredicates();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreDefinedPredicates_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRulePreDefinedPredicates"
    // InternalCryptSL.g:3272:1: entryRulePreDefinedPredicates returns [EObject current=null] : iv_rulePreDefinedPredicates= rulePreDefinedPredicates EOF ;
    public final EObject entryRulePreDefinedPredicates() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreDefinedPredicates = null;


        try {
            // InternalCryptSL.g:3272:61: (iv_rulePreDefinedPredicates= rulePreDefinedPredicates EOF )
            // InternalCryptSL.g:3273:2: iv_rulePreDefinedPredicates= rulePreDefinedPredicates EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreDefinedPredicatesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePreDefinedPredicates=rulePreDefinedPredicates();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreDefinedPredicates; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreDefinedPredicates"


    // $ANTLR start "rulePreDefinedPredicates"
    // InternalCryptSL.g:3279:1: rulePreDefinedPredicates returns [EObject current=null] : ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' ) | ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' ) | ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' ) | ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' ) ) ;
    public final EObject rulePreDefinedPredicates() throws RecognitionException {
        EObject current = null;

        Token lv_predName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_predName_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_predName_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_predName_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_predName_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_predName_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_type_4_0 = null;

        EObject lv_type_26_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3285:2: ( ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' ) | ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' ) | ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' ) | ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' ) ) )
            // InternalCryptSL.g:3286:2: ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' ) | ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' ) | ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' ) | ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' ) )
            {
            // InternalCryptSL.g:3286:2: ( ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' ) | ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' ) | ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' ) | ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' ) | ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' ) | ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' ) )
            int alt64=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt64=1;
                }
                break;
            case 56:
                {
                alt64=2;
                }
                break;
            case 57:
                {
                alt64=3;
                }
                break;
            case 58:
                {
                alt64=4;
                }
                break;
            case 59:
                {
                alt64=5;
                }
                break;
            case 60:
                {
                alt64=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalCryptSL.g:3287:3: ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' )
                    {
                    // InternalCryptSL.g:3287:3: ( ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']' )
                    // InternalCryptSL.g:3288:4: ( (lv_predName_0_0= 'neverTypeOf' ) )+ otherlv_1= '[' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_type_4_0= ruleJvmType ) ) otherlv_5= ']'
                    {
                    // InternalCryptSL.g:3288:4: ( (lv_predName_0_0= 'neverTypeOf' ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==53) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalCryptSL.g:3289:5: (lv_predName_0_0= 'neverTypeOf' )
                    	    {
                    	    // InternalCryptSL.g:3289:5: (lv_predName_0_0= 'neverTypeOf' )
                    	    // InternalCryptSL.g:3290:6: lv_predName_0_0= 'neverTypeOf'
                    	    {
                    	    lv_predName_0_0=(Token)match(input,53,FOLLOW_60); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_0_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameNeverTypeOfKeyword_0_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_0_0, "neverTypeOf");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    otherlv_1=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_0_1());
                      			
                    }
                    // InternalCryptSL.g:3306:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCryptSL.g:3307:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCryptSL.g:3307:5: (otherlv_2= RULE_ID )
                    // InternalCryptSL.g:3308:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_0_2_0());
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPreDefinedPredicatesAccess().getCommaKeyword_0_3());
                      			
                    }
                    // InternalCryptSL.g:3323:4: ( (lv_type_4_0= ruleJvmType ) )
                    // InternalCryptSL.g:3324:5: (lv_type_4_0= ruleJvmType )
                    {
                    // InternalCryptSL.g:3324:5: (lv_type_4_0= ruleJvmType )
                    // InternalCryptSL.g:3325:6: lv_type_4_0= ruleJvmType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPreDefinedPredicatesAccess().getTypeJvmTypeParserRuleCall_0_4_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
                    lv_type_4_0=ruleJvmType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_4_0,
                      							"de.darmstadt.tu.crossing.CryptSL.JvmType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3348:3: ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' )
                    {
                    // InternalCryptSL.g:3348:3: ( ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']' )
                    // InternalCryptSL.g:3349:4: ( (lv_predName_6_0= 'noCallTo' ) )+ otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) otherlv_9= ']'
                    {
                    // InternalCryptSL.g:3349:4: ( (lv_predName_6_0= 'noCallTo' ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==56) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalCryptSL.g:3350:5: (lv_predName_6_0= 'noCallTo' )
                    	    {
                    	    // InternalCryptSL.g:3350:5: (lv_predName_6_0= 'noCallTo' )
                    	    // InternalCryptSL.g:3351:6: lv_predName_6_0= 'noCallTo'
                    	    {
                    	    lv_predName_6_0=(Token)match(input,56,FOLLOW_63); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_6_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameNoCallToKeyword_1_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_6_0, "noCallTo");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    otherlv_7=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_1_1());
                      			
                    }
                    // InternalCryptSL.g:3367:4: ( (otherlv_8= RULE_ID ) )
                    // InternalCryptSL.g:3368:5: (otherlv_8= RULE_ID )
                    {
                    // InternalCryptSL.g:3368:5: (otherlv_8= RULE_ID )
                    // InternalCryptSL.g:3369:6: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_8, grammarAccess.getPreDefinedPredicatesAccess().getObjEventCrossReference_1_2_0());
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:3386:3: ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' )
                    {
                    // InternalCryptSL.g:3386:3: ( ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']' )
                    // InternalCryptSL.g:3387:4: ( (lv_predName_10_0= 'callTo' ) )+ otherlv_11= '[' ( (otherlv_12= RULE_ID ) ) otherlv_13= ']'
                    {
                    // InternalCryptSL.g:3387:4: ( (lv_predName_10_0= 'callTo' ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==57) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalCryptSL.g:3388:5: (lv_predName_10_0= 'callTo' )
                    	    {
                    	    // InternalCryptSL.g:3388:5: (lv_predName_10_0= 'callTo' )
                    	    // InternalCryptSL.g:3389:6: lv_predName_10_0= 'callTo'
                    	    {
                    	    lv_predName_10_0=(Token)match(input,57,FOLLOW_64); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_10_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameCallToKeyword_2_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_10_0, "callTo");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);

                    otherlv_11=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_2_1());
                      			
                    }
                    // InternalCryptSL.g:3405:4: ( (otherlv_12= RULE_ID ) )
                    // InternalCryptSL.g:3406:5: (otherlv_12= RULE_ID )
                    {
                    // InternalCryptSL.g:3406:5: (otherlv_12= RULE_ID )
                    // InternalCryptSL.g:3407:6: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getPreDefinedPredicatesAccess().getObjEventCrossReference_2_2_0());
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCryptSL.g:3424:3: ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' )
                    {
                    // InternalCryptSL.g:3424:3: ( ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']' )
                    // InternalCryptSL.g:3425:4: ( (lv_predName_14_0= 'notHardCoded' ) )+ otherlv_15= '[' ( (otherlv_16= RULE_ID ) ) otherlv_17= ']'
                    {
                    // InternalCryptSL.g:3425:4: ( (lv_predName_14_0= 'notHardCoded' ) )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==58) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalCryptSL.g:3426:5: (lv_predName_14_0= 'notHardCoded' )
                    	    {
                    	    // InternalCryptSL.g:3426:5: (lv_predName_14_0= 'notHardCoded' )
                    	    // InternalCryptSL.g:3427:6: lv_predName_14_0= 'notHardCoded'
                    	    {
                    	    lv_predName_14_0=(Token)match(input,58,FOLLOW_65); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_14_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameNotHardCodedKeyword_3_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_14_0, "notHardCoded");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);

                    otherlv_15=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_3_1());
                      			
                    }
                    // InternalCryptSL.g:3443:4: ( (otherlv_16= RULE_ID ) )
                    // InternalCryptSL.g:3444:5: (otherlv_16= RULE_ID )
                    {
                    // InternalCryptSL.g:3444:5: (otherlv_16= RULE_ID )
                    // InternalCryptSL.g:3445:6: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_3_2_0());
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCryptSL.g:3462:3: ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' )
                    {
                    // InternalCryptSL.g:3462:3: ( ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']' )
                    // InternalCryptSL.g:3463:4: ( (lv_predName_18_0= 'length' ) )+ otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) otherlv_21= ']'
                    {
                    // InternalCryptSL.g:3463:4: ( (lv_predName_18_0= 'length' ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==59) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalCryptSL.g:3464:5: (lv_predName_18_0= 'length' )
                    	    {
                    	    // InternalCryptSL.g:3464:5: (lv_predName_18_0= 'length' )
                    	    // InternalCryptSL.g:3465:6: lv_predName_18_0= 'length'
                    	    {
                    	    lv_predName_18_0=(Token)match(input,59,FOLLOW_66); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_18_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameLengthKeyword_4_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_18_0, "length");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);

                    otherlv_19=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_4_1());
                      			
                    }
                    // InternalCryptSL.g:3481:4: ( (otherlv_20= RULE_ID ) )
                    // InternalCryptSL.g:3482:5: (otherlv_20= RULE_ID )
                    {
                    // InternalCryptSL.g:3482:5: (otherlv_20= RULE_ID )
                    // InternalCryptSL.g:3483:6: otherlv_20= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_20, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_4_2_0());
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalCryptSL.g:3500:3: ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' )
                    {
                    // InternalCryptSL.g:3500:3: ( ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']' )
                    // InternalCryptSL.g:3501:4: ( (lv_predName_22_0= 'instanceOf' ) )+ otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) otherlv_25= ',' ( (lv_type_26_0= ruleJvmType ) ) otherlv_27= ']'
                    {
                    // InternalCryptSL.g:3501:4: ( (lv_predName_22_0= 'instanceOf' ) )+
                    int cnt63=0;
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==60) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalCryptSL.g:3502:5: (lv_predName_22_0= 'instanceOf' )
                    	    {
                    	    // InternalCryptSL.g:3502:5: (lv_predName_22_0= 'instanceOf' )
                    	    // InternalCryptSL.g:3503:6: lv_predName_22_0= 'instanceOf'
                    	    {
                    	    lv_predName_22_0=(Token)match(input,60,FOLLOW_67); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(lv_predName_22_0, grammarAccess.getPreDefinedPredicatesAccess().getPredNameInstanceOfKeyword_5_0_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                    	      						}
                    	      						setWithLastConsumed(current, "predName", lv_predName_22_0, "instanceOf");
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt63 >= 1 ) break loop63;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(63, input);
                                throw eee;
                        }
                        cnt63++;
                    } while (true);

                    otherlv_23=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getPreDefinedPredicatesAccess().getLeftSquareBracketKeyword_5_1());
                      			
                    }
                    // InternalCryptSL.g:3519:4: ( (otherlv_24= RULE_ID ) )
                    // InternalCryptSL.g:3520:5: (otherlv_24= RULE_ID )
                    {
                    // InternalCryptSL.g:3520:5: (otherlv_24= RULE_ID )
                    // InternalCryptSL.g:3521:6: otherlv_24= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      					
                    }
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_24, grammarAccess.getPreDefinedPredicatesAccess().getObjObjectCrossReference_5_2_0());
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getPreDefinedPredicatesAccess().getCommaKeyword_5_3());
                      			
                    }
                    // InternalCryptSL.g:3536:4: ( (lv_type_26_0= ruleJvmType ) )
                    // InternalCryptSL.g:3537:5: (lv_type_26_0= ruleJvmType )
                    {
                    // InternalCryptSL.g:3537:5: (lv_type_26_0= ruleJvmType )
                    // InternalCryptSL.g:3538:6: lv_type_26_0= ruleJvmType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPreDefinedPredicatesAccess().getTypeJvmTypeParserRuleCall_5_4_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
                    lv_type_26_0=ruleJvmType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPreDefinedPredicatesRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_26_0,
                      							"de.darmstadt.tu.crossing.CryptSL.JvmType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getPreDefinedPredicatesAccess().getRightSquareBracketKeyword_5_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreDefinedPredicates"


    // $ANTLR start "entryRuleJvmType"
    // InternalCryptSL.g:3564:1: entryRuleJvmType returns [EObject current=null] : iv_ruleJvmType= ruleJvmType EOF ;
    public final EObject entryRuleJvmType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmType = null;


        try {
            // InternalCryptSL.g:3564:48: (iv_ruleJvmType= ruleJvmType EOF )
            // InternalCryptSL.g:3565:2: iv_ruleJvmType= ruleJvmType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmType=ruleJvmType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmType"


    // $ANTLR start "ruleJvmType"
    // InternalCryptSL.g:3571:1: ruleJvmType returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleJvmType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCryptSL.g:3577:2: ( ( ( ruleQualifiedName ) ) )
            // InternalCryptSL.g:3578:2: ( ( ruleQualifiedName ) )
            {
            // InternalCryptSL.g:3578:2: ( ( ruleQualifiedName ) )
            // InternalCryptSL.g:3579:3: ( ruleQualifiedName )
            {
            // InternalCryptSL.g:3579:3: ( ruleQualifiedName )
            // InternalCryptSL.g:3580:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getJvmTypeRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJvmTypeAccess().getTypeJvmTypeCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmType"


    // $ANTLR start "entryRuleAggregateExpression"
    // InternalCryptSL.g:3597:1: entryRuleAggregateExpression returns [EObject current=null] : iv_ruleAggregateExpression= ruleAggregateExpression EOF ;
    public final EObject entryRuleAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateExpression = null;


        try {
            // InternalCryptSL.g:3597:60: (iv_ruleAggregateExpression= ruleAggregateExpression EOF )
            // InternalCryptSL.g:3598:2: iv_ruleAggregateExpression= ruleAggregateExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregateExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregateExpression=ruleAggregateExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregateExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAggregateExpression"


    // $ANTLR start "ruleAggregateExpression"
    // InternalCryptSL.g:3604:1: ruleAggregateExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? ) ;
    public final EObject ruleAggregateExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCryptSL.g:3610:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? ) )
            // InternalCryptSL.g:3611:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? )
            {
            // InternalCryptSL.g:3611:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )? )
            // InternalCryptSL.g:3612:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' this_ID_2= RULE_ID )?
            {
            // InternalCryptSL.g:3612:3: ( (otherlv_0= RULE_ID ) )
            // InternalCryptSL.g:3613:4: (otherlv_0= RULE_ID )
            {
            // InternalCryptSL.g:3613:4: (otherlv_0= RULE_ID )
            // InternalCryptSL.g:3614:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAggregateExpressionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getAggregateExpressionAccess().getValueSuperTypeCrossReference_0_0());
              				
            }

            }


            }

            // InternalCryptSL.g:3625:3: (otherlv_1= '.' this_ID_2= RULE_ID )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==39) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalCryptSL.g:3626:4: otherlv_1= '.' this_ID_2= RULE_ID
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAggregateExpressionAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getAggregateExpressionAccess().getIDTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAggregateExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalCryptSL.g:3639:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalCryptSL.g:3639:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalCryptSL.g:3640:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalCryptSL.g:3646:1: ruleLiteral returns [EObject current=null] : ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_1_1 = null;

        AntlrDatatypeRuleToken lv_val_1_2 = null;

        AntlrDatatypeRuleToken lv_val_1_3 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3652:2: ( ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) ) ) )
            // InternalCryptSL.g:3653:2: ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) ) )
            {
            // InternalCryptSL.g:3653:2: ( () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) ) )
            // InternalCryptSL.g:3654:3: () ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) )
            {
            // InternalCryptSL.g:3654:3: ()
            // InternalCryptSL.g:3655:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLiteralAccess().getLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:3661:3: ( ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) ) )
            // InternalCryptSL.g:3662:4: ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) )
            {
            // InternalCryptSL.g:3662:4: ( (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral ) )
            // InternalCryptSL.g:3663:5: (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral )
            {
            // InternalCryptSL.g:3663:5: (lv_val_1_1= ruleStringLiteral | lv_val_1_2= ruleIntegerLiteral | lv_val_1_3= ruleBooleanLiteral )
            int alt66=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt66=1;
                }
                break;
            case RULE_INT:
                {
                alt66=2;
                }
                break;
            case 62:
            case 63:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalCryptSL.g:3664:6: lv_val_1_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getValStringLiteralParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_1=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteralRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_1_1,
                      							"de.darmstadt.tu.crossing.CryptSL.StringLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3680:6: lv_val_1_2= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getValIntegerLiteralParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_2=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteralRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_1_2,
                      							"de.darmstadt.tu.crossing.CryptSL.IntegerLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:3696:6: lv_val_1_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getValBooleanLiteralParserRuleCall_1_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLiteralRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_1_3,
                      							"de.darmstadt.tu.crossing.CryptSL.BooleanLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalCryptSL.g:3718:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalCryptSL.g:3718:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalCryptSL.g:3719:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalCryptSL.g:3725:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:3731:2: (this_STRING_0= RULE_STRING )
            // InternalCryptSL.g:3732:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalCryptSL.g:3742:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // InternalCryptSL.g:3742:54: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalCryptSL.g:3743:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalCryptSL.g:3749:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalCryptSL.g:3755:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) ) )
            // InternalCryptSL.g:3756:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) )
            {
            // InternalCryptSL.g:3756:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_INT) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==EOF||LA67_1==15||LA67_1==18||(LA67_1>=23 && LA67_1<=24)||(LA67_1>=33 && LA67_1<=34)||LA67_1==36||LA67_1==38||(LA67_1>=45 && LA67_1<=52)||LA67_1==55||(LA67_1>=65 && LA67_1<=67)) ) {
                    alt67=1;
                }
                else if ( (LA67_1==61) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalCryptSL.g:3757:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3765:3: (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT )
                    {
                    // InternalCryptSL.g:3765:3: (this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT )
                    // InternalCryptSL.g:3766:4: this_INT_1= RULE_INT kw= '^' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,61,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIntegerLiteralAccess().getCircumflexAccentKeyword_1_1());
                      			
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalCryptSL.g:3790:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // InternalCryptSL.g:3790:54: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalCryptSL.g:3791:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalCryptSL.g:3797:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCryptSL.g:3803:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCryptSL.g:3804:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCryptSL.g:3804:2: (kw= 'true' | kw= 'false' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==62) ) {
                alt68=1;
            }
            else if ( (LA68_0==63) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalCryptSL.g:3805:3: kw= 'true'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3811:3: kw= 'false'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleUnaryPreOperator"
    // InternalCryptSL.g:3820:1: entryRuleUnaryPreOperator returns [EObject current=null] : iv_ruleUnaryPreOperator= ruleUnaryPreOperator EOF ;
    public final EObject entryRuleUnaryPreOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreOperator = null;


        try {
            // InternalCryptSL.g:3820:57: (iv_ruleUnaryPreOperator= ruleUnaryPreOperator EOF )
            // InternalCryptSL.g:3821:2: iv_ruleUnaryPreOperator= ruleUnaryPreOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryPreOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryPreOperator=ruleUnaryPreOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryPreOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryPreOperator"


    // $ANTLR start "ruleUnaryPreOperator"
    // InternalCryptSL.g:3827:1: ruleUnaryPreOperator returns [EObject current=null] : ( (lv_NOT_0_0= '!' ) ) ;
    public final EObject ruleUnaryPreOperator() throws RecognitionException {
        EObject current = null;

        Token lv_NOT_0_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:3833:2: ( ( (lv_NOT_0_0= '!' ) ) )
            // InternalCryptSL.g:3834:2: ( (lv_NOT_0_0= '!' ) )
            {
            // InternalCryptSL.g:3834:2: ( (lv_NOT_0_0= '!' ) )
            // InternalCryptSL.g:3835:3: (lv_NOT_0_0= '!' )
            {
            // InternalCryptSL.g:3835:3: (lv_NOT_0_0= '!' )
            // InternalCryptSL.g:3836:4: lv_NOT_0_0= '!'
            {
            lv_NOT_0_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_NOT_0_0, grammarAccess.getUnaryPreOperatorAccess().getNOTExclamationMarkKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getUnaryPreOperatorRule());
              				}
              				setWithLastConsumed(current, "NOT", lv_NOT_0_0, "!");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryPreOperator"


    // $ANTLR start "entryRuleComparingEQNEQOperator"
    // InternalCryptSL.g:3851:1: entryRuleComparingEQNEQOperator returns [EObject current=null] : iv_ruleComparingEQNEQOperator= ruleComparingEQNEQOperator EOF ;
    public final EObject entryRuleComparingEQNEQOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparingEQNEQOperator = null;


        try {
            // InternalCryptSL.g:3851:63: (iv_ruleComparingEQNEQOperator= ruleComparingEQNEQOperator EOF )
            // InternalCryptSL.g:3852:2: iv_ruleComparingEQNEQOperator= ruleComparingEQNEQOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparingEQNEQOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparingEQNEQOperator=ruleComparingEQNEQOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparingEQNEQOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparingEQNEQOperator"


    // $ANTLR start "ruleComparingEQNEQOperator"
    // InternalCryptSL.g:3858:1: ruleComparingEQNEQOperator returns [EObject current=null] : ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) ) ;
    public final EObject ruleComparingEQNEQOperator() throws RecognitionException {
        EObject current = null;

        Token lv_EQUAL_0_0=null;
        Token lv_UNEQUAL_1_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:3864:2: ( ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) ) )
            // InternalCryptSL.g:3865:2: ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) )
            {
            // InternalCryptSL.g:3865:2: ( ( (lv_EQUAL_0_0= '==' ) ) | ( (lv_UNEQUAL_1_0= '!=' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==65) ) {
                alt69=1;
            }
            else if ( (LA69_0==66) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalCryptSL.g:3866:3: ( (lv_EQUAL_0_0= '==' ) )
                    {
                    // InternalCryptSL.g:3866:3: ( (lv_EQUAL_0_0= '==' ) )
                    // InternalCryptSL.g:3867:4: (lv_EQUAL_0_0= '==' )
                    {
                    // InternalCryptSL.g:3867:4: (lv_EQUAL_0_0= '==' )
                    // InternalCryptSL.g:3868:5: lv_EQUAL_0_0= '=='
                    {
                    lv_EQUAL_0_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_EQUAL_0_0, grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEqualsSignEqualsSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingEQNEQOperatorRule());
                      					}
                      					setWithLastConsumed(current, "EQUAL", lv_EQUAL_0_0, "==");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3881:3: ( (lv_UNEQUAL_1_0= '!=' ) )
                    {
                    // InternalCryptSL.g:3881:3: ( (lv_UNEQUAL_1_0= '!=' ) )
                    // InternalCryptSL.g:3882:4: (lv_UNEQUAL_1_0= '!=' )
                    {
                    // InternalCryptSL.g:3882:4: (lv_UNEQUAL_1_0= '!=' )
                    // InternalCryptSL.g:3883:5: lv_UNEQUAL_1_0= '!='
                    {
                    lv_UNEQUAL_1_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_UNEQUAL_1_0, grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALExclamationMarkEqualsSignKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getComparingEQNEQOperatorRule());
                      					}
                      					setWithLastConsumed(current, "UNEQUAL", lv_UNEQUAL_1_0, "!=");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparingEQNEQOperator"


    // $ANTLR start "entryRuleCons"
    // InternalCryptSL.g:3899:1: entryRuleCons returns [EObject current=null] : iv_ruleCons= ruleCons EOF ;
    public final EObject entryRuleCons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCons = null;


        try {
            // InternalCryptSL.g:3899:45: (iv_ruleCons= ruleCons EOF )
            // InternalCryptSL.g:3900:2: iv_ruleCons= ruleCons EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCons=ruleCons();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCons; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCons"


    // $ANTLR start "ruleCons"
    // InternalCryptSL.g:3906:1: ruleCons returns [EObject current=null] : ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' ( (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) ) ) ) | ( (lv_cons_6_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleCons() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_metaVariable_5_0=null;
        EObject lv_cons_0_0 = null;

        EObject lv_litsleft_3_0 = null;

        EObject lv_cons_6_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:3912:2: ( ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' ( (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) ) ) ) | ( (lv_cons_6_0= ruleLiteralExpression ) ) ) )
            // InternalCryptSL.g:3913:2: ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' ( (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) ) ) ) | ( (lv_cons_6_0= ruleLiteralExpression ) ) )
            {
            // InternalCryptSL.g:3913:2: ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' ( (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) ) ) ) | ( (lv_cons_6_0= ruleLiteralExpression ) ) )
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalCryptSL.g:3914:3: ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' ( (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) ) ) )
                    {
                    // InternalCryptSL.g:3914:3: ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' ( (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) ) ) )
                    // InternalCryptSL.g:3915:4: ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' ( (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) ) )
                    {
                    // InternalCryptSL.g:3915:4: ( (lv_cons_0_0= ruleArrayElements ) )
                    // InternalCryptSL.g:3916:5: (lv_cons_0_0= ruleArrayElements )
                    {
                    // InternalCryptSL.g:3916:5: (lv_cons_0_0= ruleArrayElements )
                    // InternalCryptSL.g:3917:6: lv_cons_0_0= ruleArrayElements
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsAccess().getConsArrayElementsParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_71);
                    lv_cons_0_0=ruleArrayElements();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsRule());
                      						}
                      						set(
                      							current,
                      							"cons",
                      							lv_cons_0_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ArrayElements");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,67,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConsAccess().getInKeyword_0_1());
                      			
                    }
                    // InternalCryptSL.g:3938:4: ( (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) ) )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==14) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==RULE_META_VARIABLE) ) {
                        alt70=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalCryptSL.g:3939:5: (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' )
                            {
                            // InternalCryptSL.g:3939:5: (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' )
                            // InternalCryptSL.g:3940:6: otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getConsAccess().getLeftCurlyBracketKeyword_0_2_0_0());
                              					
                            }
                            // InternalCryptSL.g:3944:6: ( (lv_litsleft_3_0= ruleLitList ) )
                            // InternalCryptSL.g:3945:7: (lv_litsleft_3_0= ruleLitList )
                            {
                            // InternalCryptSL.g:3945:7: (lv_litsleft_3_0= ruleLitList )
                            // InternalCryptSL.g:3946:8: lv_litsleft_3_0= ruleLitList
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getConsAccess().getLitsleftLitListParserRuleCall_0_2_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_7);
                            lv_litsleft_3_0=ruleLitList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getConsRule());
                              								}
                              								set(
                              									current,
                              									"litsleft",
                              									lv_litsleft_3_0,
                              									"de.darmstadt.tu.crossing.CryptSL.LitList");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getConsAccess().getRightCurlyBracketKeyword_0_2_0_2());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalCryptSL.g:3969:5: ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) )
                            {
                            // InternalCryptSL.g:3969:5: ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) )
                            // InternalCryptSL.g:3970:6: (lv_metaVariable_5_0= RULE_META_VARIABLE )
                            {
                            // InternalCryptSL.g:3970:6: (lv_metaVariable_5_0= RULE_META_VARIABLE )
                            // InternalCryptSL.g:3971:7: lv_metaVariable_5_0= RULE_META_VARIABLE
                            {
                            lv_metaVariable_5_0=(Token)match(input,RULE_META_VARIABLE,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_metaVariable_5_0, grammarAccess.getConsAccess().getMetaVariableMETA_VARIABLETerminalRuleCall_0_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConsRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"metaVariable",
                              								lv_metaVariable_5_0,
                              								"de.darmstadt.tu.crossing.CryptSL.META_VARIABLE");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:3990:3: ( (lv_cons_6_0= ruleLiteralExpression ) )
                    {
                    // InternalCryptSL.g:3990:3: ( (lv_cons_6_0= ruleLiteralExpression ) )
                    // InternalCryptSL.g:3991:4: (lv_cons_6_0= ruleLiteralExpression )
                    {
                    // InternalCryptSL.g:3991:4: (lv_cons_6_0= ruleLiteralExpression )
                    // InternalCryptSL.g:3992:5: lv_cons_6_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConsAccess().getConsLiteralExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cons_6_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConsRule());
                      					}
                      					set(
                      						current,
                      						"cons",
                      						lv_cons_6_0,
                      						"de.darmstadt.tu.crossing.CryptSL.LiteralExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCons"


    // $ANTLR start "entryRuleArrayElements"
    // InternalCryptSL.g:4013:1: entryRuleArrayElements returns [EObject current=null] : iv_ruleArrayElements= ruleArrayElements EOF ;
    public final EObject entryRuleArrayElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayElements = null;


        try {
            // InternalCryptSL.g:4013:54: (iv_ruleArrayElements= ruleArrayElements EOF )
            // InternalCryptSL.g:4014:2: iv_ruleArrayElements= ruleArrayElements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayElementsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayElements=ruleArrayElements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayElements; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayElements"


    // $ANTLR start "ruleArrayElements"
    // InternalCryptSL.g:4020:1: ruleArrayElements returns [EObject current=null] : ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) ) ;
    public final EObject ruleArrayElements() throws RecognitionException {
        EObject current = null;

        Token lv_el_0_0=null;
        Token otherlv_2=null;
        EObject lv_cons_1_0 = null;

        EObject lv_cons_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4026:2: ( ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) ) )
            // InternalCryptSL.g:4027:2: ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) )
            {
            // InternalCryptSL.g:4027:2: ( ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' ) | ( (lv_cons_3_0= ruleConsPred ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==68) ) {
                alt72=1;
            }
            else if ( ((LA72_0>=RULE_ID && LA72_0<=RULE_INT)||LA72_0==53||(LA72_0>=56 && LA72_0<=60)||(LA72_0>=62 && LA72_0<=63)||(LA72_0>=69 && LA72_0<=72)) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalCryptSL.g:4028:3: ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' )
                    {
                    // InternalCryptSL.g:4028:3: ( ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')' )
                    // InternalCryptSL.g:4029:4: ( (lv_el_0_0= 'elements(' ) ) ( (lv_cons_1_0= ruleConsPred ) ) otherlv_2= ')'
                    {
                    // InternalCryptSL.g:4029:4: ( (lv_el_0_0= 'elements(' ) )
                    // InternalCryptSL.g:4030:5: (lv_el_0_0= 'elements(' )
                    {
                    // InternalCryptSL.g:4030:5: (lv_el_0_0= 'elements(' )
                    // InternalCryptSL.g:4031:6: lv_el_0_0= 'elements('
                    {
                    lv_el_0_0=(Token)match(input,68,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_el_0_0, grammarAccess.getArrayElementsAccess().getElElementsKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArrayElementsRule());
                      						}
                      						setWithLastConsumed(current, "el", lv_el_0_0, "elements(");
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:4043:4: ( (lv_cons_1_0= ruleConsPred ) )
                    // InternalCryptSL.g:4044:5: (lv_cons_1_0= ruleConsPred )
                    {
                    // InternalCryptSL.g:4044:5: (lv_cons_1_0= ruleConsPred )
                    // InternalCryptSL.g:4045:6: lv_cons_1_0= ruleConsPred
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayElementsAccess().getConsConsPredParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
                    lv_cons_1_0=ruleConsPred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayElementsRule());
                      						}
                      						set(
                      							current,
                      							"cons",
                      							lv_cons_1_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ConsPred");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArrayElementsAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:4068:3: ( (lv_cons_3_0= ruleConsPred ) )
                    {
                    // InternalCryptSL.g:4068:3: ( (lv_cons_3_0= ruleConsPred ) )
                    // InternalCryptSL.g:4069:4: (lv_cons_3_0= ruleConsPred )
                    {
                    // InternalCryptSL.g:4069:4: (lv_cons_3_0= ruleConsPred )
                    // InternalCryptSL.g:4070:5: lv_cons_3_0= ruleConsPred
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArrayElementsAccess().getConsConsPredParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cons_3_0=ruleConsPred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getArrayElementsRule());
                      					}
                      					set(
                      						current,
                      						"cons",
                      						lv_cons_3_0,
                      						"de.darmstadt.tu.crossing.CryptSL.ConsPred");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayElements"


    // $ANTLR start "entryRuleConsPred"
    // InternalCryptSL.g:4091:1: entryRuleConsPred returns [EObject current=null] : iv_ruleConsPred= ruleConsPred EOF ;
    public final EObject entryRuleConsPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsPred = null;


        try {
            // InternalCryptSL.g:4091:49: (iv_ruleConsPred= ruleConsPred EOF )
            // InternalCryptSL.g:4092:2: iv_ruleConsPred= ruleConsPred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConsPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConsPred=ruleConsPred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConsPred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConsPred"


    // $ANTLR start "ruleConsPred"
    // InternalCryptSL.g:4098:1: ruleConsPred returns [EObject current=null] : ( ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) ) | ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' ) | ( (lv_lit_16_0= ruleLiteralExpression ) ) ) ;
    public final EObject ruleConsPred() throws RecognitionException {
        EObject current = null;

        Token lv_consPred_0_0=null;
        Token otherlv_2=null;
        Token lv_consPred_3_0=null;
        Token otherlv_5=null;
        Token lv_consPred_6_0=null;
        Token otherlv_8=null;
        Token lv_part_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_lit_1_0 = null;

        EObject lv_lit_4_0 = null;

        EObject lv_lit_7_0 = null;

        AntlrDatatypeRuleToken lv_ind_10_0 = null;

        AntlrDatatypeRuleToken lv_split_12_0 = null;

        EObject lv_lit_14_0 = null;

        EObject lv_lit_16_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4104:2: ( ( ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) ) | ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' ) | ( (lv_lit_16_0= ruleLiteralExpression ) ) ) )
            // InternalCryptSL.g:4105:2: ( ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) ) | ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' ) | ( (lv_lit_16_0= ruleLiteralExpression ) ) )
            {
            // InternalCryptSL.g:4105:2: ( ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) ) | ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' ) | ( (lv_lit_16_0= ruleLiteralExpression ) ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 69:
            case 70:
            case 71:
                {
                alt74=1;
                }
                break;
            case 72:
                {
                alt74=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 62:
            case 63:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalCryptSL.g:4106:3: ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) )
                    {
                    // InternalCryptSL.g:4106:3: ( ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' ) | ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' ) | ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' ) )
                    int alt73=3;
                    switch ( input.LA(1) ) {
                    case 69:
                        {
                        alt73=1;
                        }
                        break;
                    case 70:
                        {
                        alt73=2;
                        }
                        break;
                    case 71:
                        {
                        alt73=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }

                    switch (alt73) {
                        case 1 :
                            // InternalCryptSL.g:4107:4: ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' )
                            {
                            // InternalCryptSL.g:4107:4: ( ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')' )
                            // InternalCryptSL.g:4108:5: ( (lv_consPred_0_0= 'alg(' ) ) ( (lv_lit_1_0= ruleLiteralExpression ) ) otherlv_2= ')'
                            {
                            // InternalCryptSL.g:4108:5: ( (lv_consPred_0_0= 'alg(' ) )
                            // InternalCryptSL.g:4109:6: (lv_consPred_0_0= 'alg(' )
                            {
                            // InternalCryptSL.g:4109:6: (lv_consPred_0_0= 'alg(' )
                            // InternalCryptSL.g:4110:7: lv_consPred_0_0= 'alg('
                            {
                            lv_consPred_0_0=(Token)match(input,69,FOLLOW_73); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_consPred_0_0, grammarAccess.getConsPredAccess().getConsPredAlgKeyword_0_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConsPredRule());
                              							}
                              							setWithLastConsumed(current, "consPred", lv_consPred_0_0, "alg(");
                              						
                            }

                            }


                            }

                            // InternalCryptSL.g:4122:5: ( (lv_lit_1_0= ruleLiteralExpression ) )
                            // InternalCryptSL.g:4123:6: (lv_lit_1_0= ruleLiteralExpression )
                            {
                            // InternalCryptSL.g:4123:6: (lv_lit_1_0= ruleLiteralExpression )
                            // InternalCryptSL.g:4124:7: lv_lit_1_0= ruleLiteralExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_0_0_1_0());
                              						
                            }
                            pushFollow(FOLLOW_51);
                            lv_lit_1_0=ruleLiteralExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConsPredRule());
                              							}
                              							set(
                              								current,
                              								"lit",
                              								lv_lit_1_0,
                              								"de.darmstadt.tu.crossing.CryptSL.LiteralExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getConsPredAccess().getRightParenthesisKeyword_0_0_2());
                              				
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalCryptSL.g:4147:4: ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' )
                            {
                            // InternalCryptSL.g:4147:4: ( ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')' )
                            // InternalCryptSL.g:4148:5: ( (lv_consPred_3_0= 'mode(' ) ) ( (lv_lit_4_0= ruleLiteralExpression ) ) otherlv_5= ')'
                            {
                            // InternalCryptSL.g:4148:5: ( (lv_consPred_3_0= 'mode(' ) )
                            // InternalCryptSL.g:4149:6: (lv_consPred_3_0= 'mode(' )
                            {
                            // InternalCryptSL.g:4149:6: (lv_consPred_3_0= 'mode(' )
                            // InternalCryptSL.g:4150:7: lv_consPred_3_0= 'mode('
                            {
                            lv_consPred_3_0=(Token)match(input,70,FOLLOW_73); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_consPred_3_0, grammarAccess.getConsPredAccess().getConsPredModeKeyword_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConsPredRule());
                              							}
                              							setWithLastConsumed(current, "consPred", lv_consPred_3_0, "mode(");
                              						
                            }

                            }


                            }

                            // InternalCryptSL.g:4162:5: ( (lv_lit_4_0= ruleLiteralExpression ) )
                            // InternalCryptSL.g:4163:6: (lv_lit_4_0= ruleLiteralExpression )
                            {
                            // InternalCryptSL.g:4163:6: (lv_lit_4_0= ruleLiteralExpression )
                            // InternalCryptSL.g:4164:7: lv_lit_4_0= ruleLiteralExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_51);
                            lv_lit_4_0=ruleLiteralExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConsPredRule());
                              							}
                              							set(
                              								current,
                              								"lit",
                              								lv_lit_4_0,
                              								"de.darmstadt.tu.crossing.CryptSL.LiteralExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_5=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getConsPredAccess().getRightParenthesisKeyword_0_1_2());
                              				
                            }

                            }


                            }
                            break;
                        case 3 :
                            // InternalCryptSL.g:4187:4: ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' )
                            {
                            // InternalCryptSL.g:4187:4: ( ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')' )
                            // InternalCryptSL.g:4188:5: ( (lv_consPred_6_0= 'pad(' ) ) ( (lv_lit_7_0= ruleLiteralExpression ) ) otherlv_8= ')'
                            {
                            // InternalCryptSL.g:4188:5: ( (lv_consPred_6_0= 'pad(' ) )
                            // InternalCryptSL.g:4189:6: (lv_consPred_6_0= 'pad(' )
                            {
                            // InternalCryptSL.g:4189:6: (lv_consPred_6_0= 'pad(' )
                            // InternalCryptSL.g:4190:7: lv_consPred_6_0= 'pad('
                            {
                            lv_consPred_6_0=(Token)match(input,71,FOLLOW_73); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_consPred_6_0, grammarAccess.getConsPredAccess().getConsPredPadKeyword_0_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConsPredRule());
                              							}
                              							setWithLastConsumed(current, "consPred", lv_consPred_6_0, "pad(");
                              						
                            }

                            }


                            }

                            // InternalCryptSL.g:4202:5: ( (lv_lit_7_0= ruleLiteralExpression ) )
                            // InternalCryptSL.g:4203:6: (lv_lit_7_0= ruleLiteralExpression )
                            {
                            // InternalCryptSL.g:4203:6: (lv_lit_7_0= ruleLiteralExpression )
                            // InternalCryptSL.g:4204:7: lv_lit_7_0= ruleLiteralExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_51);
                            lv_lit_7_0=ruleLiteralExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConsPredRule());
                              							}
                              							set(
                              								current,
                              								"lit",
                              								lv_lit_7_0,
                              								"de.darmstadt.tu.crossing.CryptSL.LiteralExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getConsPredAccess().getRightParenthesisKeyword_0_2_2());
                              				
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:4228:3: ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' )
                    {
                    // InternalCryptSL.g:4228:3: ( ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')' )
                    // InternalCryptSL.g:4229:4: ( (lv_part_9_0= 'part(' ) ) ( (lv_ind_10_0= ruleIntegerLiteral ) ) otherlv_11= ',' ( (lv_split_12_0= ruleStringLiteral ) ) otherlv_13= ',' ( (lv_lit_14_0= ruleLiteralExpression ) ) otherlv_15= ')'
                    {
                    // InternalCryptSL.g:4229:4: ( (lv_part_9_0= 'part(' ) )
                    // InternalCryptSL.g:4230:5: (lv_part_9_0= 'part(' )
                    {
                    // InternalCryptSL.g:4230:5: (lv_part_9_0= 'part(' )
                    // InternalCryptSL.g:4231:6: lv_part_9_0= 'part('
                    {
                    lv_part_9_0=(Token)match(input,72,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_part_9_0, grammarAccess.getConsPredAccess().getPartPartKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConsPredRule());
                      						}
                      						setWithLastConsumed(current, "part", lv_part_9_0, "part(");
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:4243:4: ( (lv_ind_10_0= ruleIntegerLiteral ) )
                    // InternalCryptSL.g:4244:5: (lv_ind_10_0= ruleIntegerLiteral )
                    {
                    // InternalCryptSL.g:4244:5: (lv_ind_10_0= ruleIntegerLiteral )
                    // InternalCryptSL.g:4245:6: lv_ind_10_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsPredAccess().getIndIntegerLiteralParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_ind_10_0=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsPredRule());
                      						}
                      						set(
                      							current,
                      							"ind",
                      							lv_ind_10_0,
                      							"de.darmstadt.tu.crossing.CryptSL.IntegerLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getConsPredAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalCryptSL.g:4266:4: ( (lv_split_12_0= ruleStringLiteral ) )
                    // InternalCryptSL.g:4267:5: (lv_split_12_0= ruleStringLiteral )
                    {
                    // InternalCryptSL.g:4267:5: (lv_split_12_0= ruleStringLiteral )
                    // InternalCryptSL.g:4268:6: lv_split_12_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsPredAccess().getSplitStringLiteralParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_split_12_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsPredRule());
                      						}
                      						set(
                      							current,
                      							"split",
                      							lv_split_12_0,
                      							"de.darmstadt.tu.crossing.CryptSL.StringLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,34,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getConsPredAccess().getCommaKeyword_1_4());
                      			
                    }
                    // InternalCryptSL.g:4289:4: ( (lv_lit_14_0= ruleLiteralExpression ) )
                    // InternalCryptSL.g:4290:5: (lv_lit_14_0= ruleLiteralExpression )
                    {
                    // InternalCryptSL.g:4290:5: (lv_lit_14_0= ruleLiteralExpression )
                    // InternalCryptSL.g:4291:6: lv_lit_14_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
                    lv_lit_14_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConsPredRule());
                      						}
                      						set(
                      							current,
                      							"lit",
                      							lv_lit_14_0,
                      							"de.darmstadt.tu.crossing.CryptSL.LiteralExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getConsPredAccess().getRightParenthesisKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:4314:3: ( (lv_lit_16_0= ruleLiteralExpression ) )
                    {
                    // InternalCryptSL.g:4314:3: ( (lv_lit_16_0= ruleLiteralExpression ) )
                    // InternalCryptSL.g:4315:4: (lv_lit_16_0= ruleLiteralExpression )
                    {
                    // InternalCryptSL.g:4315:4: (lv_lit_16_0= ruleLiteralExpression )
                    // InternalCryptSL.g:4316:5: lv_lit_16_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConsPredAccess().getLitLiteralExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_lit_16_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConsPredRule());
                      					}
                      					set(
                      						current,
                      						"lit",
                      						lv_lit_16_0,
                      						"de.darmstadt.tu.crossing.CryptSL.LiteralExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConsPred"


    // $ANTLR start "entryRuleLitList"
    // InternalCryptSL.g:4337:1: entryRuleLitList returns [EObject current=null] : iv_ruleLitList= ruleLitList EOF ;
    public final EObject entryRuleLitList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLitList = null;


        try {
            // InternalCryptSL.g:4337:48: (iv_ruleLitList= ruleLitList EOF )
            // InternalCryptSL.g:4338:2: iv_ruleLitList= ruleLitList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLitListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLitList=ruleLitList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLitList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLitList"


    // $ANTLR start "ruleLitList"
    // InternalCryptSL.g:4344:1: ruleLitList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* ) ;
    public final EObject ruleLitList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4350:2: ( ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* ) )
            // InternalCryptSL.g:4351:2: ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* )
            {
            // InternalCryptSL.g:4351:2: ( ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )* )
            // InternalCryptSL.g:4352:3: ( (lv_parameters_0_0= ruleLiteral ) ) (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )*
            {
            // InternalCryptSL.g:4352:3: ( (lv_parameters_0_0= ruleLiteral ) )
            // InternalCryptSL.g:4353:4: (lv_parameters_0_0= ruleLiteral )
            {
            // InternalCryptSL.g:4353:4: (lv_parameters_0_0= ruleLiteral )
            // InternalCryptSL.g:4354:5: lv_parameters_0_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLitListAccess().getParametersLiteralParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_parameters_0_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLitListRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_0_0,
              						"de.darmstadt.tu.crossing.CryptSL.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:4371:3: (otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==34) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalCryptSL.g:4372:4: otherlv_1= ',' ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_75); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getLitListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCryptSL.g:4376:4: ( ( (lv_parameters_2_0= ruleLiteral ) ) | otherlv_3= '...' )
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( ((LA75_0>=RULE_STRING && LA75_0<=RULE_INT)||(LA75_0>=62 && LA75_0<=63)) ) {
            	        alt75=1;
            	    }
            	    else if ( (LA75_0==73) ) {
            	        alt75=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 75, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // InternalCryptSL.g:4377:5: ( (lv_parameters_2_0= ruleLiteral ) )
            	            {
            	            // InternalCryptSL.g:4377:5: ( (lv_parameters_2_0= ruleLiteral ) )
            	            // InternalCryptSL.g:4378:6: (lv_parameters_2_0= ruleLiteral )
            	            {
            	            // InternalCryptSL.g:4378:6: (lv_parameters_2_0= ruleLiteral )
            	            // InternalCryptSL.g:4379:7: lv_parameters_2_0= ruleLiteral
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getLitListAccess().getParametersLiteralParserRuleCall_1_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_44);
            	            lv_parameters_2_0=ruleLiteral();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getLitListRule());
            	              							}
            	              							add(
            	              								current,
            	              								"parameters",
            	              								lv_parameters_2_0,
            	              								"de.darmstadt.tu.crossing.CryptSL.Literal");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCryptSL.g:4397:5: otherlv_3= '...'
            	            {
            	            otherlv_3=(Token)match(input,73,FOLLOW_44); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getLitListAccess().getFullStopFullStopFullStopKeyword_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLitList"


    // $ANTLR start "entryRulePred"
    // InternalCryptSL.g:4407:1: entryRulePred returns [EObject current=null] : iv_rulePred= rulePred EOF ;
    public final EObject entryRulePred() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePred = null;


        try {
            // InternalCryptSL.g:4407:45: (iv_rulePred= rulePred EOF )
            // InternalCryptSL.g:4408:2: iv_rulePred= rulePred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePred=rulePred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePred"


    // $ANTLR start "rulePred"
    // InternalCryptSL.g:4414:1: rulePred returns [EObject current=null] : ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) ) ;
    public final EObject rulePred() throws RecognitionException {
        EObject current = null;

        Token lv_predName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_parList_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4420:2: ( ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) ) )
            // InternalCryptSL.g:4421:2: ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) )
            {
            // InternalCryptSL.g:4421:2: ( ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' ) )
            // InternalCryptSL.g:4422:3: ( (lv_predName_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' )
            {
            // InternalCryptSL.g:4422:3: ( (lv_predName_0_0= RULE_ID ) )
            // InternalCryptSL.g:4423:4: (lv_predName_0_0= RULE_ID )
            {
            // InternalCryptSL.g:4423:4: (lv_predName_0_0= RULE_ID )
            // InternalCryptSL.g:4424:5: lv_predName_0_0= RULE_ID
            {
            lv_predName_0_0=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_predName_0_0, grammarAccess.getPredAccess().getPredNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPredRule());
              					}
              					setWithLastConsumed(
              						current,
              						"predName",
              						lv_predName_0_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }

            // InternalCryptSL.g:4440:3: ( (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' ) | otherlv_4= '[]' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==54) ) {
                alt77=1;
            }
            else if ( (LA77_0==22) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalCryptSL.g:4441:4: (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' )
                    {
                    // InternalCryptSL.g:4441:4: (otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']' )
                    // InternalCryptSL.g:4442:5: otherlv_1= '[' ( (lv_parList_2_0= ruleSuParList ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getPredAccess().getLeftSquareBracketKeyword_1_0_0());
                      				
                    }
                    // InternalCryptSL.g:4446:5: ( (lv_parList_2_0= ruleSuParList ) )
                    // InternalCryptSL.g:4447:6: (lv_parList_2_0= ruleSuParList )
                    {
                    // InternalCryptSL.g:4447:6: (lv_parList_2_0= ruleSuParList )
                    // InternalCryptSL.g:4448:7: lv_parList_2_0= ruleSuParList
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPredAccess().getParListSuParListParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_62);
                    lv_parList_2_0=ruleSuParList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPredRule());
                      							}
                      							set(
                      								current,
                      								"parList",
                      								lv_parList_2_0,
                      								"de.darmstadt.tu.crossing.CryptSL.SuParList");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getPredAccess().getRightSquareBracketKeyword_1_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:4471:4: otherlv_4= '[]'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPredAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePred"


    // $ANTLR start "entryRuleReqPred"
    // InternalCryptSL.g:4480:1: entryRuleReqPred returns [EObject current=null] : iv_ruleReqPred= ruleReqPred EOF ;
    public final EObject entryRuleReqPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqPred = null;


        try {
            // InternalCryptSL.g:4480:48: (iv_ruleReqPred= ruleReqPred EOF )
            // InternalCryptSL.g:4481:2: iv_ruleReqPred= ruleReqPred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReqPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReqPred=ruleReqPred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReqPred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReqPred"


    // $ANTLR start "ruleReqPred"
    // InternalCryptSL.g:4487:1: ruleReqPred returns [EObject current=null] : (this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )* ) ;
    public final EObject ruleReqPred() throws RecognitionException {
        EObject current = null;

        EObject this_PredLit_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4493:2: ( (this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )* ) )
            // InternalCryptSL.g:4494:2: (this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )* )
            {
            // InternalCryptSL.g:4494:2: (this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )* )
            // InternalCryptSL.g:4495:3: this_PredLit_0= rulePredLit ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getReqPredAccess().getPredLitParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_PredLit_0=rulePredLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PredLit_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:4503:3: ( () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==46) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalCryptSL.g:4504:4: () ( (lv_operator_2_0= ruleLogicalOr ) ) ( (lv_rightExpression_3_0= rulePredLit ) )
            	    {
            	    // InternalCryptSL.g:4504:4: ()
            	    // InternalCryptSL.g:4505:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getReqPredAccess().getReqPredLeftExpressionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCryptSL.g:4511:4: ( (lv_operator_2_0= ruleLogicalOr ) )
            	    // InternalCryptSL.g:4512:5: (lv_operator_2_0= ruleLogicalOr )
            	    {
            	    // InternalCryptSL.g:4512:5: (lv_operator_2_0= ruleLogicalOr )
            	    // InternalCryptSL.g:4513:6: lv_operator_2_0= ruleLogicalOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReqPredAccess().getOperatorLogicalOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_operator_2_0=ruleLogicalOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReqPredRule());
            	      						}
            	      						set(
            	      							current,
            	      							"operator",
            	      							lv_operator_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.LogicalOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalCryptSL.g:4530:4: ( (lv_rightExpression_3_0= rulePredLit ) )
            	    // InternalCryptSL.g:4531:5: (lv_rightExpression_3_0= rulePredLit )
            	    {
            	    // InternalCryptSL.g:4531:5: (lv_rightExpression_3_0= rulePredLit )
            	    // InternalCryptSL.g:4532:6: lv_rightExpression_3_0= rulePredLit
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReqPredAccess().getRightExpressionPredLitParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_rightExpression_3_0=rulePredLit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReqPredRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightExpression",
            	      							lv_rightExpression_3_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.PredLit");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReqPred"


    // $ANTLR start "entryRulePredLit"
    // InternalCryptSL.g:4554:1: entryRulePredLit returns [EObject current=null] : iv_rulePredLit= rulePredLit EOF ;
    public final EObject entryRulePredLit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredLit = null;


        try {
            // InternalCryptSL.g:4554:48: (iv_rulePredLit= rulePredLit EOF )
            // InternalCryptSL.g:4555:2: iv_rulePredLit= rulePredLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredLit=rulePredLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredLit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredLit"


    // $ANTLR start "rulePredLit"
    // InternalCryptSL.g:4561:1: rulePredLit returns [EObject current=null] : ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) ) ;
    public final EObject rulePredLit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_not_2_0=null;
        EObject lv_cons_0_0 = null;

        EObject lv_pred_3_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4567:2: ( ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) ) )
            // InternalCryptSL.g:4568:2: ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) )
            {
            // InternalCryptSL.g:4568:2: ( ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) ) )
            // InternalCryptSL.g:4569:3: ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )? ( (lv_not_2_0= '!' ) )? ( (lv_pred_3_0= rulePred ) )
            {
            // InternalCryptSL.g:4569:3: ( ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>' )?
            int alt79=2;
            switch ( input.LA(1) ) {
                case 64:
                    {
                    int LA79_1 = input.LA(2);

                    if ( ((LA79_1>=RULE_STRING && LA79_1<=RULE_INT)||LA79_1==37||LA79_1==53||(LA79_1>=56 && LA79_1<=60)||(LA79_1>=62 && LA79_1<=63)||(LA79_1>=68 && LA79_1<=72)) ) {
                        alt79=1;
                    }
                    else if ( (LA79_1==RULE_ID) ) {
                        int LA79_4 = input.LA(3);

                        if ( ((LA79_4>=23 && LA79_4<=24)||LA79_4==36||LA79_4==39||(LA79_4>=45 && LA79_4<=51)||(LA79_4>=65 && LA79_4<=67)) ) {
                            alt79=1;
                        }
                    }
                    }
                    break;
                case RULE_STRING:
                case RULE_INT:
                case 37:
                case 53:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 62:
                case 63:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                    {
                    alt79=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA79_3 = input.LA(2);

                    if ( ((LA79_3>=23 && LA79_3<=24)||LA79_3==33||LA79_3==36||LA79_3==39||(LA79_3>=45 && LA79_3<=52)||(LA79_3>=65 && LA79_3<=67)) ) {
                        alt79=1;
                    }
                    }
                    break;
            }

            switch (alt79) {
                case 1 :
                    // InternalCryptSL.g:4570:4: ( (lv_cons_0_0= ruleConstraint ) ) otherlv_1= '=>'
                    {
                    // InternalCryptSL.g:4570:4: ( (lv_cons_0_0= ruleConstraint ) )
                    // InternalCryptSL.g:4571:5: (lv_cons_0_0= ruleConstraint )
                    {
                    // InternalCryptSL.g:4571:5: (lv_cons_0_0= ruleConstraint )
                    // InternalCryptSL.g:4572:6: lv_cons_0_0= ruleConstraint
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPredLitAccess().getConsConstraintParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_78);
                    lv_cons_0_0=ruleConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPredLitRule());
                      						}
                      						set(
                      							current,
                      							"cons",
                      							lv_cons_0_0,
                      							"de.darmstadt.tu.crossing.CryptSL.Constraint");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPredLitAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCryptSL.g:4594:3: ( (lv_not_2_0= '!' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==64) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalCryptSL.g:4595:4: (lv_not_2_0= '!' )
                    {
                    // InternalCryptSL.g:4595:4: (lv_not_2_0= '!' )
                    // InternalCryptSL.g:4596:5: lv_not_2_0= '!'
                    {
                    lv_not_2_0=(Token)match(input,64,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_not_2_0, grammarAccess.getPredLitAccess().getNotExclamationMarkKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPredLitRule());
                      					}
                      					setWithLastConsumed(current, "not", lv_not_2_0, "!");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCryptSL.g:4608:3: ( (lv_pred_3_0= rulePred ) )
            // InternalCryptSL.g:4609:4: (lv_pred_3_0= rulePred )
            {
            // InternalCryptSL.g:4609:4: (lv_pred_3_0= rulePred )
            // InternalCryptSL.g:4610:5: lv_pred_3_0= rulePred
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPredLitAccess().getPredPredParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pred_3_0=rulePred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPredLitRule());
              					}
              					set(
              						current,
              						"pred",
              						lv_pred_3_0,
              						"de.darmstadt.tu.crossing.CryptSL.Pred");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredLit"


    // $ANTLR start "entryRuleEnsPred"
    // InternalCryptSL.g:4631:1: entryRuleEnsPred returns [EObject current=null] : iv_ruleEnsPred= ruleEnsPred EOF ;
    public final EObject entryRuleEnsPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsPred = null;


        try {
            // InternalCryptSL.g:4631:48: (iv_ruleEnsPred= ruleEnsPred EOF )
            // InternalCryptSL.g:4632:2: iv_ruleEnsPred= ruleEnsPred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnsPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnsPred=ruleEnsPred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnsPred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnsPred"


    // $ANTLR start "ruleEnsPred"
    // InternalCryptSL.g:4638:1: ruleEnsPred returns [EObject current=null] : ( ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleEnsPred() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_predLit_0_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4644:2: ( ( ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalCryptSL.g:4645:2: ( ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalCryptSL.g:4645:2: ( ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalCryptSL.g:4646:3: ( (lv_predLit_0_0= rulePredLit ) ) (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalCryptSL.g:4646:3: ( (lv_predLit_0_0= rulePredLit ) )
            // InternalCryptSL.g:4647:4: (lv_predLit_0_0= rulePredLit )
            {
            // InternalCryptSL.g:4647:4: (lv_predLit_0_0= rulePredLit )
            // InternalCryptSL.g:4648:5: lv_predLit_0_0= rulePredLit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnsPredAccess().getPredLitPredLitParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_79);
            lv_predLit_0_0=rulePredLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnsPredRule());
              					}
              					set(
              						current,
              						"predLit",
              						lv_predLit_0_0,
              						"de.darmstadt.tu.crossing.CryptSL.PredLit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:4665:3: (otherlv_1= 'after' ( (otherlv_2= RULE_ID ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==74) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalCryptSL.g:4666:4: otherlv_1= 'after' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,74,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEnsPredAccess().getAfterKeyword_1_0());
                      			
                    }
                    // InternalCryptSL.g:4670:4: ( (otherlv_2= RULE_ID ) )
                    // InternalCryptSL.g:4671:5: (otherlv_2= RULE_ID )
                    {
                    // InternalCryptSL.g:4671:5: (otherlv_2= RULE_ID )
                    // InternalCryptSL.g:4672:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEnsPredRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getEnsPredAccess().getLabelCondSuperTypeCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnsPred"


    // $ANTLR start "entryRuleSuParList"
    // InternalCryptSL.g:4688:1: entryRuleSuParList returns [EObject current=null] : iv_ruleSuParList= ruleSuParList EOF ;
    public final EObject entryRuleSuParList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuParList = null;


        try {
            // InternalCryptSL.g:4688:50: (iv_ruleSuParList= ruleSuParList EOF )
            // InternalCryptSL.g:4689:2: iv_ruleSuParList= ruleSuParList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuParListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSuParList=ruleSuParList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuParList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuParList"


    // $ANTLR start "ruleSuParList"
    // InternalCryptSL.g:4695:1: ruleSuParList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* ) ;
    public final EObject ruleSuParList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4701:2: ( ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* ) )
            // InternalCryptSL.g:4702:2: ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* )
            {
            // InternalCryptSL.g:4702:2: ( ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )* )
            // InternalCryptSL.g:4703:3: ( (lv_parameters_0_0= ruleSuPar ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )*
            {
            // InternalCryptSL.g:4703:3: ( (lv_parameters_0_0= ruleSuPar ) )
            // InternalCryptSL.g:4704:4: (lv_parameters_0_0= ruleSuPar )
            {
            // InternalCryptSL.g:4704:4: (lv_parameters_0_0= ruleSuPar )
            // InternalCryptSL.g:4705:5: lv_parameters_0_0= ruleSuPar
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSuParListAccess().getParametersSuParParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_parameters_0_0=ruleSuPar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSuParListRule());
              					}
              					add(
              						current,
              						"parameters",
              						lv_parameters_0_0,
              						"de.darmstadt.tu.crossing.CryptSL.SuPar");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:4722:3: (otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==34) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalCryptSL.g:4723:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleSuPar ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_77); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getSuParListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCryptSL.g:4727:4: ( (lv_parameters_2_0= ruleSuPar ) )
            	    // InternalCryptSL.g:4728:5: (lv_parameters_2_0= ruleSuPar )
            	    {
            	    // InternalCryptSL.g:4728:5: (lv_parameters_2_0= ruleSuPar )
            	    // InternalCryptSL.g:4729:6: lv_parameters_2_0= ruleSuPar
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSuParListAccess().getParametersSuParParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_parameters_2_0=ruleSuPar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSuParListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameters",
            	      							lv_parameters_2_0,
            	      							"de.darmstadt.tu.crossing.CryptSL.SuPar");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuParList"


    // $ANTLR start "entryRuleSuPar"
    // InternalCryptSL.g:4751:1: entryRuleSuPar returns [EObject current=null] : iv_ruleSuPar= ruleSuPar EOF ;
    public final EObject entryRuleSuPar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuPar = null;


        try {
            // InternalCryptSL.g:4751:46: (iv_ruleSuPar= ruleSuPar EOF )
            // InternalCryptSL.g:4752:2: iv_ruleSuPar= ruleSuPar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuParRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSuPar=ruleSuPar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuPar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuPar"


    // $ANTLR start "ruleSuPar"
    // InternalCryptSL.g:4758:1: ruleSuPar returns [EObject current=null] : ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) ) ;
    public final EObject ruleSuPar() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4764:2: ( ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) ) )
            // InternalCryptSL.g:4765:2: ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) )
            {
            // InternalCryptSL.g:4765:2: ( () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' ) )
            // InternalCryptSL.g:4766:3: () ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' )
            {
            // InternalCryptSL.g:4766:3: ()
            // InternalCryptSL.g:4767:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSuParAccess().getSuParAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:4773:3: ( ( (lv_val_1_0= ruleConsPred ) ) | otherlv_2= '_' | otherlv_3= 'this' )
            int alt83=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 62:
            case 63:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt83=1;
                }
                break;
            case 42:
                {
                alt83=2;
                }
                break;
            case 75:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalCryptSL.g:4774:4: ( (lv_val_1_0= ruleConsPred ) )
                    {
                    // InternalCryptSL.g:4774:4: ( (lv_val_1_0= ruleConsPred ) )
                    // InternalCryptSL.g:4775:5: (lv_val_1_0= ruleConsPred )
                    {
                    // InternalCryptSL.g:4775:5: (lv_val_1_0= ruleConsPred )
                    // InternalCryptSL.g:4776:6: lv_val_1_0= ruleConsPred
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSuParAccess().getValConsPredParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_0=ruleConsPred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSuParRule());
                      						}
                      						set(
                      							current,
                      							"val",
                      							lv_val_1_0,
                      							"de.darmstadt.tu.crossing.CryptSL.ConsPred");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:4794:4: otherlv_2= '_'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSuParAccess().get_Keyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:4799:4: otherlv_3= 'this'
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSuParAccess().getThisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuPar"


    // $ANTLR start "entryRuleObject"
    // InternalCryptSL.g:4808:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalCryptSL.g:4808:47: (iv_ruleObject= ruleObject EOF )
            // InternalCryptSL.g:4809:2: iv_ruleObject= ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalCryptSL.g:4815:1: ruleObject returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:4821:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCryptSL.g:4822:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCryptSL.g:4822:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCryptSL.g:4823:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalCryptSL.g:4823:3: ()
            // InternalCryptSL.g:4824:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectAccess().getObjectAction_0(),
              					current);
              			
            }

            }

            // InternalCryptSL.g:4830:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCryptSL.g:4831:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCryptSL.g:4831:4: (lv_name_1_0= RULE_ID )
            // InternalCryptSL.g:4832:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.xbase.Xtype.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleJvmTypeReference"
    // InternalCryptSL.g:4852:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // InternalCryptSL.g:4852:57: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // InternalCryptSL.g:4853:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // InternalCryptSL.g:4859:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4865:2: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // InternalCryptSL.g:4866:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // InternalCryptSL.g:4866:2: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=36 && LA85_0<=37)) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalCryptSL.g:4867:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // InternalCryptSL.g:4867:3: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // InternalCryptSL.g:4868:4: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_80);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_JvmParameterizedTypeReference_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCryptSL.g:4876:4: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==54) && (synpred1_InternalCryptSL())) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalCryptSL.g:4877:5: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // InternalCryptSL.g:4883:5: ( () ruleArrayBrackets )
                    	    // InternalCryptSL.g:4884:6: () ruleArrayBrackets
                    	    {
                    	    // InternalCryptSL.g:4884:6: ()
                    	    // InternalCryptSL.g:4885:7: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							current = forceCreateModelElementAndSet(
                    	      								grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	      								current);
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_80);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:4902:3: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_XFunctionTypeRef_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // InternalCryptSL.g:4914:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // InternalCryptSL.g:4914:53: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // InternalCryptSL.g:4915:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // InternalCryptSL.g:4921:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCryptSL.g:4927:2: ( (kw= '[' kw= ']' ) )
            // InternalCryptSL.g:4928:2: (kw= '[' kw= ']' )
            {
            // InternalCryptSL.g:4928:2: (kw= '[' kw= ']' )
            // InternalCryptSL.g:4929:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,54,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0());
              		
            }
            kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // InternalCryptSL.g:4943:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // InternalCryptSL.g:4943:57: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // InternalCryptSL.g:4944:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // InternalCryptSL.g:4950:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:4956:2: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:4957:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:4957:2: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:4958:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // InternalCryptSL.g:4958:3: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==37) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalCryptSL.g:4959:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_81); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalCryptSL.g:4963:4: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_ID||(LA87_0>=36 && LA87_0<=37)) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalCryptSL.g:4964:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // InternalCryptSL.g:4964:5: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // InternalCryptSL.g:4965:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // InternalCryptSL.g:4965:6: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // InternalCryptSL.g:4966:7: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_39);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              							}
                              							add(
                              								current,
                              								"paramTypes",
                              								lv_paramTypes_1_0,
                              								"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalCryptSL.g:4983:5: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==34) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // InternalCryptSL.g:4984:6: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,34,FOLLOW_82); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	      					
                            	    }
                            	    // InternalCryptSL.g:4988:6: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // InternalCryptSL.g:4989:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // InternalCryptSL.g:4989:7: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // InternalCryptSL.g:4990:8: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_39);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"paramTypes",
                            	      									lv_paramTypes_3_0,
                            	      									"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop86;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,38,FOLLOW_78); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
              		
            }
            // InternalCryptSL.g:5018:3: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:5019:4: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:5019:4: (lv_returnType_6_0= ruleJvmTypeReference )
            // InternalCryptSL.g:5020:5: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              					}
              					set(
              						current,
              						"returnType",
              						lv_returnType_6_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // InternalCryptSL.g:5041:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // InternalCryptSL.g:5041:70: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // InternalCryptSL.g:5042:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // InternalCryptSL.g:5048:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5054:2: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? ) )
            // InternalCryptSL.g:5055:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            {
            // InternalCryptSL.g:5055:2: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )? )
            // InternalCryptSL.g:5056:3: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            {
            // InternalCryptSL.g:5056:3: ( ( ruleQualifiedName ) )
            // InternalCryptSL.g:5057:4: ( ruleQualifiedName )
            {
            // InternalCryptSL.g:5057:4: ( ruleQualifiedName )
            // InternalCryptSL.g:5058:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_83);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCryptSL.g:5072:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?
            int alt93=2;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalCryptSL.g:5073:4: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    {
                    // InternalCryptSL.g:5073:4: ( ( '<' )=>otherlv_1= '<' )
                    // InternalCryptSL.g:5074:5: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                      				
                    }

                    }

                    // InternalCryptSL.g:5080:4: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // InternalCryptSL.g:5081:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // InternalCryptSL.g:5081:5: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // InternalCryptSL.g:5082:6: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_2_0,
                      							"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCryptSL.g:5099:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==34) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalCryptSL.g:5100:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,34,FOLLOW_33); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalCryptSL.g:5104:5: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // InternalCryptSL.g:5105:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // InternalCryptSL.g:5105:6: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // InternalCryptSL.g:5106:7: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_34);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_4_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }
                    // InternalCryptSL.g:5128:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==39) && (synpred3_InternalCryptSL())) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalCryptSL.g:5129:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    {
                    	    // InternalCryptSL.g:5129:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
                    	    // InternalCryptSL.g:5130:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
                    	    {
                    	    // InternalCryptSL.g:5136:6: ( () otherlv_7= '.' )
                    	    // InternalCryptSL.g:5137:7: () otherlv_7= '.'
                    	    {
                    	    // InternalCryptSL.g:5137:7: ()
                    	    // InternalCryptSL.g:5138:8: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								current = forceCreateModelElementAndSet(
                    	      									grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0(),
                    	      									current);
                    	      							
                    	    }

                    	    }

                    	    otherlv_7=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_7, grammarAccess.getJvmParameterizedTypeReferenceAccess().getFullStopKeyword_1_4_0_0_1());
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCryptSL.g:5150:5: ( ( ruleValidID ) )
                    	    // InternalCryptSL.g:5151:6: ( ruleValidID )
                    	    {
                    	    // InternalCryptSL.g:5151:6: ( ruleValidID )
                    	    // InternalCryptSL.g:5152:7: ruleValidID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_84);
                    	    ruleValidID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalCryptSL.g:5166:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?
                    	    int alt91=2;
                    	    alt91 = dfa91.predict(input);
                    	    switch (alt91) {
                    	        case 1 :
                    	            // InternalCryptSL.g:5167:6: ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>'
                    	            {
                    	            // InternalCryptSL.g:5167:6: ( ( '<' )=>otherlv_9= '<' )
                    	            // InternalCryptSL.g:5168:7: ( '<' )=>otherlv_9= '<'
                    	            {
                    	            otherlv_9=(Token)match(input,23,FOLLOW_33); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							newLeafNode(otherlv_9, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_4_2_0());
                    	              						
                    	            }

                    	            }

                    	            // InternalCryptSL.g:5174:6: ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) )
                    	            // InternalCryptSL.g:5175:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            {
                    	            // InternalCryptSL.g:5175:7: (lv_arguments_10_0= ruleJvmArgumentTypeReference )
                    	            // InternalCryptSL.g:5176:8: lv_arguments_10_0= ruleJvmArgumentTypeReference
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              								newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_1_0());
                    	              							
                    	            }
                    	            pushFollow(FOLLOW_34);
                    	            lv_arguments_10_0=ruleJvmArgumentTypeReference();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              								if (current==null) {
                    	              									current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	              								}
                    	              								add(
                    	              									current,
                    	              									"arguments",
                    	              									lv_arguments_10_0,
                    	              									"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	              								afterParserOrEnumRuleCall();
                    	              							
                    	            }

                    	            }


                    	            }

                    	            // InternalCryptSL.g:5193:6: (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )*
                    	            loop90:
                    	            do {
                    	                int alt90=2;
                    	                int LA90_0 = input.LA(1);

                    	                if ( (LA90_0==34) ) {
                    	                    alt90=1;
                    	                }


                    	                switch (alt90) {
                    	            	case 1 :
                    	            	    // InternalCryptSL.g:5194:7: otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,34,FOLLOW_33); if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      							newLeafNode(otherlv_11, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_4_2_2_0());
                    	            	      						
                    	            	    }
                    	            	    // InternalCryptSL.g:5198:7: ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) )
                    	            	    // InternalCryptSL.g:5199:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    {
                    	            	    // InternalCryptSL.g:5199:8: (lv_arguments_12_0= ruleJvmArgumentTypeReference )
                    	            	    // InternalCryptSL.g:5200:9: lv_arguments_12_0= ruleJvmArgumentTypeReference
                    	            	    {
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_4_2_2_1_0());
                    	            	      								
                    	            	    }
                    	            	    pushFollow(FOLLOW_34);
                    	            	    lv_arguments_12_0=ruleJvmArgumentTypeReference();

                    	            	    state._fsp--;
                    	            	    if (state.failed) return current;
                    	            	    if ( state.backtracking==0 ) {

                    	            	      									if (current==null) {
                    	            	      										current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	            	      									}
                    	            	      									add(
                    	            	      										current,
                    	            	      										"arguments",
                    	            	      										lv_arguments_12_0,
                    	            	      										"org.eclipse.xtext.xbase.Xtype.JvmArgumentTypeReference");
                    	            	      									afterParserOrEnumRuleCall();
                    	            	      								
                    	            	    }

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop90;
                    	                }
                    	            } while (true);

                    	            otherlv_13=(Token)match(input,24,FOLLOW_68); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_13, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_4_2_3());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // InternalCryptSL.g:5229:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // InternalCryptSL.g:5229:65: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // InternalCryptSL.g:5230:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // InternalCryptSL.g:5236:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5242:2: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // InternalCryptSL.g:5243:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // InternalCryptSL.g:5243:2: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID||(LA94_0>=36 && LA94_0<=37)) ) {
                alt94=1;
            }
            else if ( (LA94_0==35) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalCryptSL.g:5244:3: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmTypeReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:5253:3: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JvmWildcardTypeReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // InternalCryptSL.g:5265:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // InternalCryptSL.g:5265:65: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // InternalCryptSL.g:5266:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // InternalCryptSL.g:5272:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5278:2: ( ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? ) )
            // InternalCryptSL.g:5279:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            {
            // InternalCryptSL.g:5279:2: ( () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )? )
            // InternalCryptSL.g:5280:3: () otherlv_1= '?' ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            {
            // InternalCryptSL.g:5280:3: ()
            // InternalCryptSL.g:5281:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalCryptSL.g:5291:3: ( ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* ) | ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* ) )?
            int alt97=3;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==76) ) {
                alt97=1;
            }
            else if ( (LA97_0==78) ) {
                alt97=2;
            }
            switch (alt97) {
                case 1 :
                    // InternalCryptSL.g:5292:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    {
                    // InternalCryptSL.g:5292:4: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )* )
                    // InternalCryptSL.g:5293:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) ) ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    {
                    // InternalCryptSL.g:5293:5: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // InternalCryptSL.g:5294:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // InternalCryptSL.g:5294:6: (lv_constraints_2_0= ruleJvmUpperBound )
                    // InternalCryptSL.g:5295:7: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_86);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_2_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCryptSL.g:5312:5: ( (lv_constraints_3_0= ruleJvmUpperBoundAnded ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==77) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalCryptSL.g:5313:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    {
                    	    // InternalCryptSL.g:5313:6: (lv_constraints_3_0= ruleJvmUpperBoundAnded )
                    	    // InternalCryptSL.g:5314:7: lv_constraints_3_0= ruleJvmUpperBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundAndedParserRuleCall_2_0_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_86);
                    	    lv_constraints_3_0=ruleJvmUpperBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_3_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmUpperBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:5333:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    {
                    // InternalCryptSL.g:5333:4: ( ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )* )
                    // InternalCryptSL.g:5334:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) ) ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    {
                    // InternalCryptSL.g:5334:5: ( (lv_constraints_4_0= ruleJvmLowerBound ) )
                    // InternalCryptSL.g:5335:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    {
                    // InternalCryptSL.g:5335:6: (lv_constraints_4_0= ruleJvmLowerBound )
                    // InternalCryptSL.g:5336:7: lv_constraints_4_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_86);
                    lv_constraints_4_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      							}
                      							add(
                      								current,
                      								"constraints",
                      								lv_constraints_4_0,
                      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBound");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCryptSL.g:5353:5: ( (lv_constraints_5_0= ruleJvmLowerBoundAnded ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==77) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalCryptSL.g:5354:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    {
                    	    // InternalCryptSL.g:5354:6: (lv_constraints_5_0= ruleJvmLowerBoundAnded )
                    	    // InternalCryptSL.g:5355:7: lv_constraints_5_0= ruleJvmLowerBoundAnded
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundAndedParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_86);
                    	    lv_constraints_5_0=ruleJvmLowerBoundAnded();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"constraints",
                    	      								lv_constraints_5_0,
                    	      								"org.eclipse.xtext.xbase.Xtype.JvmLowerBoundAnded");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // InternalCryptSL.g:5378:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // InternalCryptSL.g:5378:54: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // InternalCryptSL.g:5379:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // InternalCryptSL.g:5385:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5391:2: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:5392:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:5392:2: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:5393:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
              		
            }
            // InternalCryptSL.g:5397:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:5398:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:5398:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCryptSL.g:5399:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // InternalCryptSL.g:5420:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // InternalCryptSL.g:5420:59: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // InternalCryptSL.g:5421:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // InternalCryptSL.g:5427:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5433:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:5434:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:5434:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:5435:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalCryptSL.g:5439:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:5440:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:5440:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCryptSL.g:5441:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // InternalCryptSL.g:5462:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // InternalCryptSL.g:5462:54: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // InternalCryptSL.g:5463:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // InternalCryptSL.g:5469:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5475:2: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:5476:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:5476:2: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:5477:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
              		
            }
            // InternalCryptSL.g:5481:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:5482:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:5482:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCryptSL.g:5483:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleJvmLowerBoundAnded"
    // InternalCryptSL.g:5504:1: entryRuleJvmLowerBoundAnded returns [EObject current=null] : iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF ;
    public final EObject entryRuleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBoundAnded = null;


        try {
            // InternalCryptSL.g:5504:59: (iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF )
            // InternalCryptSL.g:5505:2: iv_ruleJvmLowerBoundAnded= ruleJvmLowerBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundAndedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJvmLowerBoundAnded=ruleJvmLowerBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBoundAnded; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBoundAnded"


    // $ANTLR start "ruleJvmLowerBoundAnded"
    // InternalCryptSL.g:5511:1: ruleJvmLowerBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5517:2: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // InternalCryptSL.g:5518:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // InternalCryptSL.g:5518:2: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // InternalCryptSL.g:5519:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAndedAccess().getAmpersandKeyword_0());
              		
            }
            // InternalCryptSL.g:5523:3: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // InternalCryptSL.g:5524:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // InternalCryptSL.g:5524:4: (lv_typeReference_1_0= ruleJvmTypeReference )
            // InternalCryptSL.g:5525:5: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJvmLowerBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJvmLowerBoundAndedRule());
              					}
              					set(
              						current,
              						"typeReference",
              						lv_typeReference_1_0,
              						"org.eclipse.xtext.xbase.Xtype.JvmTypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBoundAnded"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCryptSL.g:5546:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCryptSL.g:5546:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCryptSL.g:5547:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCryptSL.g:5553:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5559:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalCryptSL.g:5560:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalCryptSL.g:5560:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalCryptSL.g:5561:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCryptSL.g:5571:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==39) ) {
                    int LA98_2 = input.LA(2);

                    if ( (LA98_2==RULE_ID) ) {
                        alt98=1;
                    }


                }


                switch (alt98) {
            	case 1 :
            	    // InternalCryptSL.g:5572:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_68);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ValidID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalCryptSL.g:5592:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalCryptSL.g:5592:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalCryptSL.g:5593:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalCryptSL.g:5599:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5605:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // InternalCryptSL.g:5606:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // InternalCryptSL.g:5606:2: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // InternalCryptSL.g:5607:3: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_87);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,39,FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1());
              		
            }
            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalCryptSL.g:5631:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalCryptSL.g:5631:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalCryptSL.g:5632:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalCryptSL.g:5638:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalCryptSL.g:5644:2: (this_ID_0= RULE_ID )
            // InternalCryptSL.g:5645:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // InternalCryptSL.g:5655:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // InternalCryptSL.g:5655:59: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // InternalCryptSL.g:5656:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // InternalCryptSL.g:5662:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token lv_wildcard_4_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5668:2: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // InternalCryptSL.g:5669:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // InternalCryptSL.g:5669:2: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // InternalCryptSL.g:5670:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,79,FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
              		
            }
            // InternalCryptSL.g:5674:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt101=3;
            alt101 = dfa101.predict(input);
            switch (alt101) {
                case 1 :
                    // InternalCryptSL.g:5675:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    {
                    // InternalCryptSL.g:5675:4: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) )
                    // InternalCryptSL.g:5676:5: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    {
                    // InternalCryptSL.g:5676:5: ( (lv_static_1_0= 'static' ) )
                    // InternalCryptSL.g:5677:6: (lv_static_1_0= 'static' )
                    {
                    // InternalCryptSL.g:5677:6: (lv_static_1_0= 'static' )
                    // InternalCryptSL.g:5678:7: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,80,FOLLOW_90); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      							setWithLastConsumed(current, "static", true, "static");
                      						
                    }

                    }


                    }

                    // InternalCryptSL.g:5690:5: ( (lv_extension_2_0= 'extension' ) )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==81) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalCryptSL.g:5691:6: (lv_extension_2_0= 'extension' )
                            {
                            // InternalCryptSL.g:5691:6: (lv_extension_2_0= 'extension' )
                            // InternalCryptSL.g:5692:7: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,81,FOLLOW_90); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              							}
                              							setWithLastConsumed(current, "extension", true, "extension");
                              						
                            }

                            }


                            }
                            break;

                    }

                    // InternalCryptSL.g:5704:5: ( ( ruleQualifiedNameInStaticImport ) )
                    // InternalCryptSL.g:5705:6: ( ruleQualifiedNameInStaticImport )
                    {
                    // InternalCryptSL.g:5705:6: ( ruleQualifiedNameInStaticImport )
                    // InternalCryptSL.g:5706:7: ruleQualifiedNameInStaticImport
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_18);
                    ruleQualifiedNameInStaticImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCryptSL.g:5720:5: ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==33) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==RULE_ID) ) {
                        alt100=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalCryptSL.g:5721:6: ( (lv_wildcard_4_0= '*' ) )
                            {
                            // InternalCryptSL.g:5721:6: ( (lv_wildcard_4_0= '*' ) )
                            // InternalCryptSL.g:5722:7: (lv_wildcard_4_0= '*' )
                            {
                            // InternalCryptSL.g:5722:7: (lv_wildcard_4_0= '*' )
                            // InternalCryptSL.g:5723:8: lv_wildcard_4_0= '*'
                            {
                            lv_wildcard_4_0=(Token)match(input,33,FOLLOW_91); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_wildcard_4_0, grammarAccess.getXImportDeclarationAccess().getWildcardAsteriskKeyword_1_0_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              								}
                              								setWithLastConsumed(current, "wildcard", true, "*");
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCryptSL.g:5736:6: ( (lv_memberName_5_0= ruleValidID ) )
                            {
                            // InternalCryptSL.g:5736:6: ( (lv_memberName_5_0= ruleValidID ) )
                            // InternalCryptSL.g:5737:7: (lv_memberName_5_0= ruleValidID )
                            {
                            // InternalCryptSL.g:5737:7: (lv_memberName_5_0= ruleValidID )
                            // InternalCryptSL.g:5738:8: lv_memberName_5_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getXImportDeclarationAccess().getMemberNameValidIDParserRuleCall_1_0_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_91);
                            lv_memberName_5_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                              								}
                              								set(
                              									current,
                              									"memberName",
                              									lv_memberName_5_0,
                              									"org.eclipse.xtext.xbase.Xtype.ValidID");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCryptSL.g:5758:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalCryptSL.g:5758:4: ( ( ruleQualifiedName ) )
                    // InternalCryptSL.g:5759:5: ( ruleQualifiedName )
                    {
                    // InternalCryptSL.g:5759:5: ( ruleQualifiedName )
                    // InternalCryptSL.g:5760:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_91);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCryptSL.g:5775:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // InternalCryptSL.g:5775:4: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // InternalCryptSL.g:5776:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalCryptSL.g:5776:5: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // InternalCryptSL.g:5777:6: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_91);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"importedNamespace",
                      							lv_importedNamespace_7_0,
                      							"org.eclipse.xtext.xbase.Xtype.QualifiedNameWithWildcard");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCryptSL.g:5795:3: (otherlv_8= ';' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==18) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalCryptSL.g:5796:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameInStaticImport"
    // InternalCryptSL.g:5805:1: entryRuleQualifiedNameInStaticImport returns [String current=null] : iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF ;
    public final String entryRuleQualifiedNameInStaticImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameInStaticImport = null;


        try {
            // InternalCryptSL.g:5805:67: (iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF )
            // InternalCryptSL.g:5806:2: iv_ruleQualifiedNameInStaticImport= ruleQualifiedNameInStaticImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameInStaticImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameInStaticImport=ruleQualifiedNameInStaticImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameInStaticImport.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameInStaticImport"


    // $ANTLR start "ruleQualifiedNameInStaticImport"
    // InternalCryptSL.g:5812:1: ruleQualifiedNameInStaticImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '.' )+ ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameInStaticImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;



        	enterRule();

        try {
            // InternalCryptSL.g:5818:2: ( (this_ValidID_0= ruleValidID kw= '.' )+ )
            // InternalCryptSL.g:5819:2: (this_ValidID_0= ruleValidID kw= '.' )+
            {
            // InternalCryptSL.g:5819:2: (this_ValidID_0= ruleValidID kw= '.' )+
            int cnt103=0;
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==RULE_ID) ) {
                    int LA103_2 = input.LA(2);

                    if ( (LA103_2==39) ) {
                        alt103=1;
                    }


                }


                switch (alt103) {
            	case 1 :
            	    // InternalCryptSL.g:5820:3: this_ValidID_0= ruleValidID kw= '.'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getQualifiedNameInStaticImportAccess().getValidIDParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_87);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ValidID_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,39,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getQualifiedNameInStaticImportAccess().getFullStopKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt103 >= 1 ) break loop103;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameInStaticImport"

    // $ANTLR start synpred1_InternalCryptSL
    public final void synpred1_InternalCryptSL_fragment() throws RecognitionException {   
        // InternalCryptSL.g:4877:5: ( ( () ruleArrayBrackets ) )
        // InternalCryptSL.g:4877:6: ( () ruleArrayBrackets )
        {
        // InternalCryptSL.g:4877:6: ( () ruleArrayBrackets )
        // InternalCryptSL.g:4878:6: () ruleArrayBrackets
        {
        // InternalCryptSL.g:4878:6: ()
        // InternalCryptSL.g:4879:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCryptSL

    // $ANTLR start synpred2_InternalCryptSL
    public final void synpred2_InternalCryptSL_fragment() throws RecognitionException {   
        // InternalCryptSL.g:5074:5: ( '<' )
        // InternalCryptSL.g:5074:6: '<'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalCryptSL

    // $ANTLR start synpred3_InternalCryptSL
    public final void synpred3_InternalCryptSL_fragment() throws RecognitionException {   
        // InternalCryptSL.g:5130:6: ( ( () '.' ) )
        // InternalCryptSL.g:5130:7: ( () '.' )
        {
        // InternalCryptSL.g:5130:7: ( () '.' )
        // InternalCryptSL.g:5131:7: () '.'
        {
        // InternalCryptSL.g:5131:7: ()
        // InternalCryptSL.g:5132:7: 
        {
        }

        match(input,39,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalCryptSL

    // $ANTLR start synpred4_InternalCryptSL
    public final void synpred4_InternalCryptSL_fragment() throws RecognitionException {   
        // InternalCryptSL.g:5168:7: ( '<' )
        // InternalCryptSL.g:5168:8: '<'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalCryptSL

    // Delegated rules

    public final boolean synpred3_InternalCryptSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCryptSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCryptSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCryptSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCryptSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCryptSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCryptSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCryptSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA71 dfa71 = new DFA71(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA101 dfa101 = new DFA101(this);
    static final String dfa_1s = "\54\uffff";
    static final String dfa_2s = "\2\uffff\5\15\17\uffff\2\15\7\uffff\4\15\4\uffff\1\15\1\uffff\1\15\2\uffff";
    static final String dfa_3s = "\1\4\1\uffff\5\22\1\65\5\66\1\uffff\1\6\7\4\2\22\1\42\4\67\1\42\1\4\4\22\1\4\2\47\1\4\1\22\1\4\1\22\2\47";
    static final String dfa_4s = "\1\110\1\uffff\5\103\1\66\1\70\1\71\1\72\1\73\1\74\1\uffff\1\6\7\4\2\103\1\42\4\67\1\42\1\4\4\103\1\4\2\67\1\4\1\103\1\4\1\103\2\67";
    static final String dfa_5s = "\1\uffff\1\1\13\uffff\1\2\36\uffff";
    static final String dfa_6s = "\54\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\2\1\3\56\uffff\1\7\2\uffff\1\10\1\11\1\12\1\13\1\14\1\uffff\1\4\1\5\4\uffff\5\1",
            "",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\10\uffff\1\16\3\uffff\2\15\1\1",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\1\17\5\uffff\10\15\14\uffff\2\15\1\1",
            "\1\7\1\20",
            "\1\21\1\uffff\1\10",
            "\1\22\2\uffff\1\11",
            "\1\23\3\uffff\1\12",
            "\1\24\4\uffff\1\13",
            "\1\25\5\uffff\1\14",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\45",
            "\1\46\17\uffff\1\47",
            "\1\50\17\uffff\1\51",
            "\1\52",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\53",
            "\1\15\4\uffff\2\15\10\uffff\1\15\2\uffff\1\15\1\uffff\1\15\6\uffff\10\15\14\uffff\2\15\1\1",
            "\1\46\17\uffff\1\47",
            "\1\50\17\uffff\1\51"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3913:2: ( ( ( (lv_cons_0_0= ruleArrayElements ) ) otherlv_1= 'in' ( (otherlv_2= '{' ( (lv_litsleft_3_0= ruleLitList ) ) otherlv_4= '}' ) | ( (lv_metaVariable_5_0= RULE_META_VARIABLE ) ) ) ) | ( (lv_cons_6_0= ruleLiteralExpression ) ) )";
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\2\14\uffff";
    static final String dfa_10s = "\1\4\1\0\13\uffff";
    static final String dfa_11s = "\1\115\1\0\13\uffff";
    static final String dfa_12s = "\2\uffff\1\2\11\uffff\1\1";
    static final String dfa_13s = "\1\uffff\1\0\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\22\uffff\1\1\1\2\11\uffff\5\2\17\uffff\1\2\26\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "5072:3: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( ( ruleValidID ) ) ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )? )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_1 = input.LA(1);

                         
                        int index93_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCryptSL()) ) {s = 12;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index93_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\16\uffff";
    static final String dfa_16s = "\1\2\15\uffff";
    static final String dfa_17s = "\1\4\1\0\14\uffff";
    static final String dfa_18s = "\1\115\1\0\14\uffff";
    static final String dfa_19s = "\2\uffff\1\2\12\uffff\1\1";
    static final String dfa_20s = "\1\uffff\1\0\14\uffff}>";
    static final String[] dfa_21s = {
            "\1\2\22\uffff\1\1\1\2\11\uffff\6\2\16\uffff\1\2\26\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "5166:5: ( ( ( '<' )=>otherlv_9= '<' ) ( (lv_arguments_10_0= ruleJvmArgumentTypeReference ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleJvmArgumentTypeReference ) ) )* otherlv_13= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCryptSL()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\7\uffff";
    static final String dfa_23s = "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String dfa_24s = "\1\4\1\uffff\1\22\1\4\1\uffff\1\22\1\uffff";
    static final String dfa_25s = "\1\120\1\uffff\1\47\1\41\1\uffff\1\47\1\uffff";
    static final String dfa_26s = "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String dfa_27s = "\7\uffff}>";
    static final String[] dfa_28s = {
            "\1\2\113\uffff\1\1",
            "",
            "\1\4\24\uffff\1\3",
            "\1\5\34\uffff\1\6",
            "",
            "\1\4\24\uffff\1\3",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA101 extends DFA {

        public DFA101(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 101;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "5674:3: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedNameInStaticImport ) ) ( ( (lv_wildcard_4_0= '*' ) ) | ( (lv_memberName_5_0= ruleValidID ) ) ) ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xC000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xDF20002000000070L,0x00000000000001F1L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002200000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xDF20002000000072L,0x00000000000001F1L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003801000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003C00800012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003800000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003800000012L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000400002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000060000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200A00000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0003000001800002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0004200000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010000200000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0240000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0840000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0xDF20000000000070L,0x00000000000001F0L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0xC000000000000060L,0x0000000000000200L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0040000000400000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0xDF20040000000070L,0x00000000000009F0L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000007000000010L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000003000000010L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000008000800002L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000040002L});

}