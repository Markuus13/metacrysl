/*
 * generated by Xtext 2.20.0
 */
package de.darmstadt.tu.crossing.parser.antlr;

import com.google.inject.Inject;
import de.darmstadt.tu.crossing.parser.antlr.internal.InternalCryptSLParser;
import de.darmstadt.tu.crossing.services.CryptSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CryptSLParser extends AbstractAntlrParser {

	@Inject
	private CryptSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCryptSLParser createParser(XtextTokenStream stream) {
		return new InternalCryptSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}

	public CryptSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CryptSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
