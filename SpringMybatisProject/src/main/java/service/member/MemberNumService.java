package service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import command.MemberCommand;
import repository.MemberRepository;

public class MemberNumService {
	@Autowired
	MemberRepository memberRepository;
	public void memNo(Model model, MemberCommand memberCommand) {
		String memNo = memberRepository.memNo();
		memberCommand.setMemId(memNo);
		model.addAttribute("memberCommand", memberCommand);
	}
	
}
