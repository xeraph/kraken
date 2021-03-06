package org.krakenapps.bundle;

import org.krakenapps.api.BundleRepository;
import org.krakenapps.api.FieldOption;
import org.krakenapps.confdb.CollectionName;

@CollectionName("bundle_repos")
public class BundleRepositoryConfig {
	@FieldOption(nullable = false)
	private String name;

	@FieldOption(nullable = false)
	private String url;

	@FieldOption(nullable = false)
	private boolean isAuthRequired;

	@FieldOption(nullable = true)
	private String account;

	@FieldOption(nullable = true)
	private String password;

	@FieldOption(nullable = false)
	private int priority;

	@FieldOption(nullable = true)
	private String trustStoreAlias;

	@FieldOption(nullable = true)
	private String keyStoreAlias;

	public BundleRepositoryConfig() {
	}

	public BundleRepositoryConfig(BundleRepository repo) {
		this.name = repo.getName();
		this.url = repo.getUrl().toString();
		this.isAuthRequired = repo.isAuthRequired();
		this.account = repo.getAccount();
		this.password = repo.getPassword();
		this.priority = repo.getPriority();
		this.trustStoreAlias = repo.getTrustStoreAlias();
		this.keyStoreAlias = repo.getKeyStoreAlias();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isAuthRequired() {
		return isAuthRequired;
	}

	public void setAuthRequired(boolean isAuthRequired) {
		this.isAuthRequired = isAuthRequired;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTrustStoreAlias() {
		return trustStoreAlias;
	}

	public void setTrustStoreAlias(String trustStoreAlias) {
		this.trustStoreAlias = trustStoreAlias;
	}

	public String getKeyStoreAlias() {
		return keyStoreAlias;
	}

	public void setKeyStoreAlias(String keyStoreAlias) {
		this.keyStoreAlias = keyStoreAlias;
	}
}
